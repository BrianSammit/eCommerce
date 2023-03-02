package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.Identity;

public class PersonalDetailsID extends Identity {
    public PersonalDetailsID(){}
    private PersonalDetailsID(String id) {
        super(id);
    }
    public static PersonalDetailsID of(String id) {
        return new PersonalDetailsID(id);
    }
}
