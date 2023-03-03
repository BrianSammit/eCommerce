package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.Identity;

public class UserId extends Identity {
    public UserId(){}
    private UserId(String id) {
        super(id);
    }
    public static UserId of(String id) {
        return new UserId(id);
    }
}
