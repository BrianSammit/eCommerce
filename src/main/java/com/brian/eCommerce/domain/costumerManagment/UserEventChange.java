package com.brian.eCommerce.domain.costumerManagment;

import com.brian.eCommerce.domain.costumerManagment.events.ContactDetailsAdded;
import com.brian.eCommerce.domain.costumerManagment.events.PersonalDetailsAdded;
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

        apply((PersonalDetailsAdded event) -> {
            user.personalDetails = new PersonalDetails(event.getPersonalDetailsID(), event.getName(), event.getLastName(),
                    event.getAge(), event.getOccupation());
        });

        apply((ContactDetailsAdded event) -> {
            user.contactDetails = new ContactDetails(event.getContactDetailsID(), event.getCountry(), event.getCity(),
                    event.getAddress(), event.getAddressDetails(), event.getEmail(), event.getPhoneNum());
        });
    }
}
