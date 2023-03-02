package com.brian.eCommerce.domain.costumerManagment.events;

import com.brian.eCommerce.generic.DomainEvent;

public class UserCreated extends DomainEvent {
    private String userName;
    private String password;

    public UserCreated(String userName, String password) {
        super("eCommerce.userCreated");
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
