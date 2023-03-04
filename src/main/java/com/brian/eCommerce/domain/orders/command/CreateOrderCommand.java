package com.brian.eCommerce.domain.orders.command;

import com.brian.eCommerce.domain.values.OrderID;
import com.brian.eCommerce.generic.Command;

import java.util.Date;

public class CreateOrderCommand extends Command {

    private String orderID;
//    private Date date;
    private String status;
    private String shippingAddress;
    private String userID;

    public CreateOrderCommand(String orderID, String status, String shippingAddress, String userID) {
        this.orderID = orderID;
//        this.date = date;
        this.status = status;
        this.shippingAddress = shippingAddress;
        this.userID = userID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserID() {
        return userID;
    }

    public void setCostumerID(String costumerID) {
        this.userID = costumerID;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

}
