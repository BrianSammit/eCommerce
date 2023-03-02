package com.brian.eCommerce.domain.catalog.events;

import com.brian.eCommerce.generic.DomainEvent;

import java.util.Date;

public class ProductCreated extends DomainEvent {
    private final String name;
    private final Float price;
    private final Boolean inStock;
    private final String description;
    private final String publisher;
    private final String location;

    public ProductCreated(String name, Float price, Boolean inStock, String description,
                          String publisher, String location) {
        super("eCommerce.productCreated");
        this.price = price;
        this.inStock = inStock;
        this.description = description;
        this.publisher = publisher;
        this.location = location;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public String getDescription() {
        return description;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getLocation() {
        return location;
    }
}