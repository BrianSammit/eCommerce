package com.brian.eCommerce.business.costumerManagment;

import com.brian.eCommerce.business.commons.EventRepository;
import com.brian.eCommerce.business.commons.UseCaseForCommand;
import com.brian.eCommerce.domain.costumerManagment.User;
import com.brian.eCommerce.domain.costumerManagment.command.AddContactDetailsCommand;
import com.brian.eCommerce.domain.orders.Order;
import com.brian.eCommerce.domain.orders.command.AddProductCommand;
import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.DomainEvent;

import java.util.List;
import java.util.stream.Collectors;

public class AddContactDetailsUseCase implements UseCaseForCommand<AddContactDetailsCommand> {
    private  final EventRepository eventRepository;

    public AddContactDetailsUseCase(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<DomainEvent> apply(AddContactDetailsCommand command) {
        List<DomainEvent> userEvent = eventRepository.findByAggregatedRootId(command.getUserID());
        User user = User.from(UserID.of(command.getUserID()), userEvent);
        user.addContactDetails(ContactDetailsID.of(command.getContactDetailsID()), new Country(command.getCountry()),
                new City(command.getCity()), new Address(command.getAddress()), new AddressDetails(command.getAddressDetails()),
                new Email(command.getEmail()), new PhoneNum(command.getPhoneNum()));
        return user.getUncommittedChanges().stream().map(eventRepository::saveEvent).collect(Collectors.toList());
    }
}
