package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.Identity;

public class UserID extends Identity {
    public UserID(){}
    private UserID(String id) {
        super(id);
    }
    public static UserID of(String id) {
        return new UserID(id);
    }
}
