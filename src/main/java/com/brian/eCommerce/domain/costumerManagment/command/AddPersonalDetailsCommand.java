package com.brian.eCommerce.domain.costumerManagment.command;

import com.brian.eCommerce.domain.values.Age;
import com.brian.eCommerce.domain.values.LastName;
import com.brian.eCommerce.domain.values.Name;
import com.brian.eCommerce.domain.values.Occupation;
import com.brian.eCommerce.generic.Command;

public class AddPersonalDetailsCommand extends Command {

    protected String personalDetailsID;
    protected String userID;
    protected String name;
    protected String lastName;
    protected Integer age;
    protected String occupation;

    public AddPersonalDetailsCommand(String personalDetailsID, String userID, String name, String lastName,
                                     Integer age, String occupation) {
        this.personalDetailsID = personalDetailsID;
        this.userID = userID;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
    }

    public String getPersonalDetailsID() {
        return personalDetailsID;
    }

    public void setPersonalDetailsID(String personalDetailsID) {
        this.personalDetailsID = personalDetailsID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
