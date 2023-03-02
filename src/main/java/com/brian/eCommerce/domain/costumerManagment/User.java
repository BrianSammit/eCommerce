package com.brian.eCommerce.domain.costumerManagment;

import com.brian.eCommerce.domain.costumerManagment.events.ContactDetailsAdded;
import com.brian.eCommerce.domain.costumerManagment.events.PersonalDetailsAdded;
import com.brian.eCommerce.domain.costumerManagment.events.UserCreated;
import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.AggregateRoot;
import com.brian.eCommerce.generic.DomainEvent;

import java.util.List;
import java.util.Objects;

public class User extends AggregateRoot<UserID> {

    protected UserName userName;
    protected Password password;

    public User(UserID id, UserName userName, Password password) {
        super(id);
        subscribe(new UserEventChange(this));
        appendChange(new UserCreated(userName.value(), password.value()));
    }

    public User(UserID id) {
        super(id);
        subscribe(new UserEventChange(this));
    }

    public static User from(UserID id, List<DomainEvent> events){
        User user = new User(id);
        events.forEach(user::applyEvent);
        return user;
    }

    public void addPersonalDetails(PersonalDetailsID id, Name name, LastName lastname, Age age, Occupation occupation){
        Objects.requireNonNull(id);
        appendChange(new PersonalDetailsAdded(id, name, lastname, age, occupation));
    }

    public void addContactDetails(ContactDetailsID id, Country country, City city, Address address,
                                  AddressDetails addressDetails, Email email, PhoneNum phoneNum){
        Objects.requireNonNull(id);
        appendChange(new ContactDetailsAdded(id, country, city, address, addressDetails, email, phoneNum));
    }
}
