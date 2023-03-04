package com.brian.eCommerce.domain.costumerManagment;

import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.Entity;

public class PersonalDetails extends Entity<PersonalDetailsID> {

    protected Name name;
    protected LastName lastName;
    protected Age age;
    protected Occupation occupation;

    public PersonalDetails(PersonalDetailsID id, Name name, LastName lastName, Age age, Occupation occupation) {
        super(id);
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
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
