package com.brian.eCommerce.domain.orders.events;

import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.DomainEvent;

import java.util.logging.LogRecord;

public class ProductAdded extends DomainEvent {

    protected String productID;
    protected String name;
    protected Float price;
    protected String description;
    protected String location;

    public ProductAdded(String productID, String name, Float price, String description,
                        String location) {
        super("eCommerce.productAdded");
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.description = description;
        this.location = location;
    }

    public String getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }
}
