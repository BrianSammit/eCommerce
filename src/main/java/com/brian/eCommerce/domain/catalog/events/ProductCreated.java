package com.brian.eCommerce.domain.catalog.events;

import com.brian.eCommerce.generic.DomainEvent;

import java.util.Date;

public class ProductCreated extends DomainEvent {
    private final String name;
    private final Float price;
    private final String description;
    private final String location;

    public ProductCreated(String name, Float price, String description, String location) {
        super("eCommerce.productCreated");
        this.price = price;
        this.description = description;
        this.location = location;
        this.name = name;
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