package com.brian.eCommerce.domain.costumerManagment;

import com.brian.eCommerce.domain.costumerManagment.events.UserCreated;
import com.brian.eCommerce.domain.values.Password;
import com.brian.eCommerce.domain.values.UserID;
import com.brian.eCommerce.domain.values.UserName;
import com.brian.eCommerce.generic.AggregateRoot;
import com.brian.eCommerce.generic.DomainEvent;

import java.util.List;

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
}
