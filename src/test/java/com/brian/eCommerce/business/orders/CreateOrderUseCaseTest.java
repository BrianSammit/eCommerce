package com.brian.eCommerce.business.orders;

import com.brian.eCommerce.business.commons.EventRepository;
import com.brian.eCommerce.domain.orders.command.CreateOrderCommand;
import com.brian.eCommerce.domain.orders.events.OrderCreated;
import com.brian.eCommerce.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CreateOrderUseCaseTest {

    @Mock
    private EventRepository eventRepository;
    private CreateOrderUseCase createOrderUseCase;

    @BeforeEach
    void setup(){
        createOrderUseCase = new CreateOrderUseCase(eventRepository);
    }

    @Test
    void successfulScenario(){
        CreateOrderCommand createOrderCommand = new CreateOrderCommand(
                "testID",
                "Pending",
                "address test",
                "userID"
        );
        OrderCreated orderCreated = new OrderCreated(
                "Pending",
                "address test",
                "userID",
                "ProductID",
                2
        );
        orderCreated.setAggregateRootId("testID");
        Mockito.when(eventRepository.saveEvent(ArgumentMatchers.any(OrderCreated.class)))
                .thenAnswer(invocationOnMock -> {
                    return invocationOnMock.getArgument(0);
                });
        List<DomainEvent> domainEvents = createOrderUseCase.apply(createOrderCommand);

        Assertions.assertEquals(1, domainEvents.size());

    }
}