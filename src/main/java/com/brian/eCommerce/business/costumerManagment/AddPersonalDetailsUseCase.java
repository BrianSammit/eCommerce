package com.brian.eCommerce.business.costumerManagment;

import com.brian.eCommerce.business.commons.EventRepository;
import com.brian.eCommerce.business.commons.UseCaseForCommand;
import com.brian.eCommerce.domain.costumerManagment.User;
import com.brian.eCommerce.domain.costumerManagment.command.AddPersonalDetailsCommand;
import com.brian.eCommerce.domain.orders.Order;
import com.brian.eCommerce.domain.orders.command.AddProductCommand;
import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.DomainEvent;

import java.util.List;
import java.util.stream.Collectors;

public class AddPersonalDetailsUseCase implements UseCaseForCommand<AddPersonalDetailsCommand> {
    private  final EventRepository eventRepository;

    public AddPersonalDetailsUseCase(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<DomainEvent> apply(AddPersonalDetailsCommand command) {
        List<DomainEvent> userEvent = eventRepository.findByAggregatedRootId(command.getUserID());
        User user = User.from(UserID.of(command.getUserID()), userEvent);
        user.addPersonalDetails(
                PersonalDetailsID.of(command.getPersonalDetailsID()),
                new Name(command.getName()),
                new LastName(command.getLastName()),
                new Age(command.getAge()),
                new Occupation(command.getOccupation()));
        return user.getUncommittedChanges().stream().map(eventRepository::saveEvent).collect(Collectors.toList());
    }
}
