package com.brian.eCommerce.domain.costumerManagment.events;

import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.DomainEvent;

public class PersonalDetailsAdded extends DomainEvent {
    protected PersonalDetailsID personalDetailsID;
    protected Name name;
    protected LastName lastName;
    protected Age age;
    protected Occupation occupation;

    public PersonalDetailsAdded(PersonalDetailsID personalDetailsID,
                                Name name, LastName lastName, Age age, Occupation occupation) {
        super("eCommerce.personalDetailsAdded");
        this.personalDetailsID = personalDetailsID;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
    }

    public PersonalDetailsID getPersonalDetailsID() {
        return personalDetailsID;
    }

    public Name getName() {
        return name;
    }

    public LastName getLastName() {
        return lastName;
    }

    public Age getAge() {
        return age;
    }

    public Occupation getOccupation() {
        return occupation;
    }
}
