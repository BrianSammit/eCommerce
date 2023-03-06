package com.brian.eCommerce.business.catalog;

import com.brian.eCommerce.business.commons.EventRepository;
import com.brian.eCommerce.business.orders.CreateOrderUseCase;
import com.brian.eCommerce.domain.catalog.command.CreateProductCommand;
import com.brian.eCommerce.domain.catalog.events.ProductCreated;
import com.brian.eCommerce.domain.orders.command.CreateOrderCommand;
import com.brian.eCommerce.domain.orders.events.OrderCreated;
import com.brian.eCommerce.domain.orders.events.ProductAdded;
import com.brian.eCommerce.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class CreateProductUseCaseTest{

    @Mock
    private EventRepository eventRepository;
    private CreateProductUseCase createProductUseCase;

    @BeforeEach
    void setup(){
        createProductUseCase = new CreateProductUseCase(eventRepository);
    }

    @Test
    void successfulScenario(){
        CreateProductCommand createProductCommand = new CreateProductCommand(
                "productID",
                "test name",
                20.50f,
                "test description",
                "test location"
        );
        ProductCreated productCreated = new ProductCreated(
                "test name",
                20.50f,
                "test description",
                "test location"
        );

        productCreated.setAggregateRootId("productID");
        Mockito.when(eventRepository.saveEvent(ArgumentMatchers.any(ProductCreated.class)))
                .thenAnswer(invocationOnMock -> {
                    return invocationOnMock.getArgument(0);
                });
        List<DomainEvent> domainEvents = createProductUseCase.apply(createProductCommand);
        ProductCreated event = (ProductCreated) domainEvents.get(0);

        Assertions.assertEquals(1, domainEvents.size());
        Assertions.assertNotEquals(2, domainEvents.size());
        Assertions.assertEquals("productID", domainEvents.get(0).aggregateRootId());
        Assertions.assertNotEquals("test1", domainEvents.get(0).aggregateRootId());
        Assertions.assertEquals("test name", event.getName());
        Assertions.assertNotEquals("name", event.getName());
        Assertions.assertEquals(20.50f, event.getPrice());
        Assertions.assertNotEquals(50.0f, event.getPrice());
        Assertions.assertEquals("test description", event.getDescription());
        Assertions.assertNotEquals("description", event.getDescription());
        Assertions.assertEquals("test location", event.getLocation());
        Assertions.assertNotEquals("location", event.getLocation());

    }
}