package com.brian.eCommerce.business.costumerManagment;

import com.brian.eCommerce.business.commons.EventRepository;
import com.brian.eCommerce.business.commons.UseCaseForCommand;
import com.brian.eCommerce.domain.costumerManagment.User;
import com.brian.eCommerce.domain.costumerManagment.command.CreateUserCommand;
import com.brian.eCommerce.domain.orders.Order;
import com.brian.eCommerce.domain.orders.command.CreateOrderCommand;
import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.DomainEvent;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CreateUserUseCase implements UseCaseForCommand<CreateUserCommand> {

    private final EventRepository eventRepository;

    public CreateUserUseCase(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<DomainEvent> apply(CreateUserCommand command) {
        User user = new User(
                UserID.of(command.getUserID()),
                new UserName(command.getUserName()),
                new Password(command.getPassword()));
        return user.getUncommittedChanges().stream().map(eventRepository::saveEvent).collect(Collectors.toList());
    }
}
