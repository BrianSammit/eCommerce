package com.brian.eCommerce.domain.costumerManagment.command;

import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.Command;

public class AddContactDetailsCommand extends Command {
    protected String contactDetailsID;
    protected String userID;
    protected String country;
    protected String city;
    protected String address;
    protected String addressDetails;
    protected String email;
    protected Integer phoneNum;

    public AddContactDetailsCommand(String contactDetailsID, String userID,
                                    String country, String city, String address,
                                    String addressDetails, String email, Integer phoneNum) {
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(String addressDetails) {
        this.addressDetails = addressDetails;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }
}
