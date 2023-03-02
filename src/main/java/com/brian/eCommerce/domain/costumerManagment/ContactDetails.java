package com.brian.eCommerce.domain.costumerManagment;

import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.Entity;

public class ContactDetails extends Entity<ContactDetailsID> {

    private Country country;
    private City city;
    private Address address;
    private AddressDetails addressDetails;
    private Email email;
    private PhoneNum phoneNum;

    public ContactDetails(ContactDetailsID id, Country country, City city,
                          Address address, AddressDetails addressDetails,
                          Email email, PhoneNum phoneNum) {
        super(id);
        this.country = country;
        this.city = city;
        this.address = address;
        this.addressDetails = addressDetails;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public Country getCountry() {
        return country;
    }

    public City getCity() {
        return city;
    }

    public Address getAddress() {
        return address;
    }

    public AddressDetails getAddressDetails() {
        return addressDetails;
    }

    public Email getEmail() {
        return email;
    }

    public PhoneNum getPhoneNum() {
        return phoneNum;
    }
}
