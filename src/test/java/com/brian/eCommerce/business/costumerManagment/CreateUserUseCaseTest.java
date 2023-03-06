package com.brian.eCommerce.business.costumerManagment;

import com.brian.eCommerce.business.catalog.CreateProductUseCase;
import com.brian.eCommerce.business.commons.EventRepository;
import com.brian.eCommerce.domain.catalog.command.CreateProductCommand;
import com.brian.eCommerce.domain.catalog.events.ProductCreated;
import com.brian.eCommerce.domain.costumerManagment.command.CreateUserCommand;
import com.brian.eCommerce.domain.costumerManagment.events.UserCreated;
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
class CreateUserUseCaseTest {

    @Mock
    private EventRepository eventRepository;
    private CreateUserUseCase createUserUseCase;

    @BeforeEach
    void setup() {
        createUserUseCase = new CreateUserUseCase(eventRepository);
    }

    @Test
    void successfulScenario() {
        CreateUserCommand createUserCommand = new CreateUserCommand(
                "userID",
                "test name",
                "test password"
        );
        UserCreated userCreated = new UserCreated(
                "userID",
                "test name"
        );

        userCreated.setAggregateRootId("userID");
        Mockito.when(eventRepository.saveEvent(ArgumentMatchers.any(UserCreated.class)))
                .thenAnswer(invocationOnMock -> {
                    return invocationOnMock.getArgument(0);
                });
        List<DomainEvent> domainEvents = createUserUseCase.apply(createUserCommand);
        UserCreated event = (UserCreated) domainEvents.get(0);

        Assertions.assertEquals(1, domainEvents.size());
        Assertions.assertNotEquals(2, domainEvents.size());
        Assertions.assertEquals("userID", domainEvents.get(0).aggregateRootId());
        Assertions.assertNotEquals("test1", domainEvents.get(0).aggregateRootId());
        Assertions.assertEquals("test name", event.getUserName());
        Assertions.assertNotEquals("name", event.getUserName());
        Assertions.assertEquals("test password", event.getPassword());
        Assertions.assertNotEquals("password", event.getPassword());

    }
}