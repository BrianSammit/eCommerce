package com.brian.eCommerce.domain.orders.command;

import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.Command;

public class AddProductCommand extends Command {
    protected String productID;
    protected String orderID;
    protected String name;
    protected Float price;
    protected String description;
    protected String location;
    protected Integer quantity;

    public AddProductCommand(String productID, String orderID, String name, Float price, String description, String location, Integer quantity) {
        this.productID = productID;
        this.orderID = orderID;
        this.name = name;
        this.price = price;
        this.description = description;
        this.location = location;
        this.quantity = quantity;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
