package com.brian.eCommerce.domain.orders.command;

import com.brian.eCommerce.domain.values.OrderID;
import com.brian.eCommerce.generic.Command;

import java.util.Date;

public class CreateOrderCommand extends Command {

    private String orderID;
    private Date date;
    private Boolean status;
    private String costumerID;
    private String shippingAddress;

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getCostumerID() {
        return costumerID;
    }

    public void setCostumerID(String costumerID) {
        this.costumerID = costumerID;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public CreateOrderCommand(String orderID, Date date, Boolean status, String costumerID, String shippingAddress) {
        this.orderID = orderID;
        this.date = date;
        this.status = status;
        this.costumerID = costumerID;
        this.shippingAddress = shippingAddress;
    }
}
