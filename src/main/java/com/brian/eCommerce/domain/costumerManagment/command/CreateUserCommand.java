package com.brian.eCommerce.domain.costumerManagment.command;

import com.brian.eCommerce.domain.values.Password;
import com.brian.eCommerce.domain.values.UserName;
import com.brian.eCommerce.generic.Command;

import java.util.Date;

public class CreateUserCommand extends Command {
    protected String userID;
    protected UserName userName;
    protected Password password;

    public CreateUserCommand(String userID, UserName userName, Password password) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public UserName getUserName() {
        return userName;
    }

    public void setUserName(UserName userName) {
        this.userName = userName;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }
}
