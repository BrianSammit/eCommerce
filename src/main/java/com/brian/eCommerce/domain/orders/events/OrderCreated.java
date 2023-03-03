package com.brian.eCommerce.domain.orders.events;

import com.brian.eCommerce.domain.values.ProductID;
import com.brian.eCommerce.domain.values.Quantity;
import com.brian.eCommerce.generic.DomainEvent;

import java.util.Date;

public class OrderCreated extends DomainEvent {
    protected Date date;
    protected String status;
    protected String shippingAddress;

    protected String userID;

    protected String productID;
    protected Integer quantity;

    public OrderCreated(String type) {
        super("eCommerce.orderCreated");
    }

    public OrderCreated(Date date, String status, String shippingAddress,
                        String userID, String productID, Integer quantity) {
        super("eCommerce.orderCreated");
        this.date = date;
        this.status = status;
        this.shippingAddress = shippingAddress;
        this.userID = userID;
        this.productID = productID;
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }


    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getUserID() {
        return userID;
    }

    public String getProductID() {
        return productID;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
