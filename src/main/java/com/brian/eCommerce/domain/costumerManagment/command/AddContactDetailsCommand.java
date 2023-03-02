package com.brian.eCommerce.domain.costumerManagment.command;

import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.Command;

public class AddContactDetailsCommand extends Command {
    protected String contactDetailsID;
    protected String userID;
    protected Country country;
    protected City city;
    protected Address address;
    protected AddressDetails addressDetails;
    protected Email email;
    protected PhoneNum phoneNum;

    public AddContactDetailsCommand(String contactDetailsID, String userID,
                                    Country country, City city, Address address,
                                    AddressDetails addressDetails, Email email, PhoneNum phoneNum) {
        this.contactDetailsID = contactDetailsID;
        this.userID = userID;
        this.country = country;
        this.city = city;
        this.address = address;
        this.addressDetails = addressDetails;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String getContactDetailsID() {
        return contactDetailsID;
    }

    public void setContactDetailsID(String contactDetailsID) {
        this.contactDetailsID = contactDetailsID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AddressDetails getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(AddressDetails addressDetails) {
        this.addressDetails = addressDetails;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public PhoneNum getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(PhoneNum phoneNum) {
        this.phoneNum = phoneNum;
    }
}
