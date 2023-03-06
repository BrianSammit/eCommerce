package com.brian.eCommerce.business.orders;

import com.brian.eCommerce.business.commons.EventRepository;
import com.brian.eCommerce.domain.orders.command.AddProductCommand;
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

@ExtendWith(MockitoExtension.class)
class AddProductUseCaseTest {

    @Mock
    private EventRepository eventRepository;
    private AddProductUseCase addProductUseCase;

    @BeforeEach
    void setup() {
        addProductUseCase = new AddProductUseCase(eventRepository);
    }

    @Test
    void successfulScenario() {

        OrderCreated orderCreated = new OrderCreated(
                "Pending",
                "address test",
                "userID",
                "ProductID",
                2
        );

        orderCreated.setAggregateRootId("orderID");

        AddProductCommand addProductCommand = new AddProductCommand(
                "productID",
                "orderID",
                "test name",
                50.0f,
                "test description",
                "USA",
                5
        );
        ProductAdded productAdded = new ProductAdded(
                "productID",
                "test name",
                50.0f,
                "test description",
                "USA"
        );


        Mockito.when(eventRepository.findByAggregatedRootId("orderID")).thenAnswer(
                invocationOnMock -> {
                    return List.of(orderCreated);
                }
        );

        Mockito.when(eventRepository.saveEvent(ArgumentMatchers.any()))
                .thenAnswer(invocationOnMock -> {
                    return invocationOnMock.getArgument(0);
                });
        List<DomainEvent> domainEvents = addProductUseCase.apply(addProductCommand);
        ProductAdded event = (ProductAdded) domainEvents.get(0);

        Assertions.assertEquals(1, domainEvents.size());
        Assertions.assertNotEquals(2, domainEvents.size());
        Assertions.assertEquals("orderID", domainEvents.get(0).aggregateRootId());
        Assertions.assertNotEquals("productID", domainEvents.get(0).aggregateRootId());
        Assertions.assertEquals("productID", event.getProductID());
        Assertions.assertNotEquals("orderID", event.getProductID());
        Assertions.assertEquals("test name", event.getName());
        Assertions.assertNotEquals("name", event.getName());
        Assertions.assertEquals("test description", event.getDescription());
        Assertions.assertNotEquals("description", event.getDescription());
        Assertions.assertEquals(1 , domainEvents.size());
        Assertions.assertNotEquals(3 , domainEvents.size());
    }
}
