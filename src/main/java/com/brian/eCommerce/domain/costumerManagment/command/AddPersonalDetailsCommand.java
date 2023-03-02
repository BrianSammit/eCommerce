package com.brian.eCommerce.domain.costumerManagment.command;

import com.brian.eCommerce.domain.values.Age;
import com.brian.eCommerce.domain.values.LastName;
import com.brian.eCommerce.domain.values.Name;
import com.brian.eCommerce.domain.values.Occupation;
import com.brian.eCommerce.generic.Command;

public class AddPersonalDetailsCommand extends Command {

    protected String personalDetalisID;
    protected String userID;
    protected Name name;
    protected LastName lastName;
    protected Age age;
    protected Occupation occupation;

    public AddPersonalDetailsCommand(String personalDetalisID, String userID, Name name, LastName lastName, Age age, Occupation occupation) {
        this.personalDetalisID = personalDetalisID;
        this.userID = userID;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
    }

    public String getPersonalDetalisID() {
        return personalDetalisID;
    }

    public void setPersonalDetalisID(String personalDetalisID) {
        this.personalDetalisID = personalDetalisID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public LastName getLastName() {
        return lastName;
    }

    public void setLastName(LastName lastName) {
        this.lastName = lastName;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }
}
