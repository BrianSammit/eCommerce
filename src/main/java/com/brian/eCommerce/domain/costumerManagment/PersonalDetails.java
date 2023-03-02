package com.brian.eCommerce.domain.costumerManagment;

import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.Entity;

public class PersonalDetails extends Entity<PersonalDetailsID> {

    private Name name;
    private LastName lastName;
    private Age age;
    private Occupation occupation;

    public PersonalDetails(PersonalDetailsID id, Name name, LastName lastName, Age age, Occupation occupation) {
        super(id);
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setLastName(LastName lastName) {
        this.lastName = lastName;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

}
