package com.brian.eCommerce.domain.costumerManagment;

import com.brian.eCommerce.domain.costumerManagment.events.UserCreated;
import com.brian.eCommerce.domain.values.Password;
import com.brian.eCommerce.domain.values.UserName;
import com.brian.eCommerce.generic.EventChange;

public class UserEventChange extends EventChange {
    public UserEventChange(User user) {
        apply((UserCreated event) -> {
            user.userName = new UserName(event.getUserName());
            user.password = new Password(event.getPassword());
        });
    }
}
