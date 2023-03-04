package com.brian.eCommerce.domain.costumerManagment.command;

import com.brian.eCommerce.domain.values.Password;
import com.brian.eCommerce.domain.values.UserName;
import com.brian.eCommerce.generic.Command;

import java.util.Date;

public class CreateUserCommand extends Command {
    protected String userID;
    protected String userName;
    protected String password;

    public CreateUserCommand(String userID, String userName, String password) {
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
