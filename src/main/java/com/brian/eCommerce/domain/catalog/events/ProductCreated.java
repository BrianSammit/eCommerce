package com.brian.eCommerce.domain.catalog.events;

import com.brian.eCommerce.generic.DomainEvent;

import java.util.Date;

public class ProductCreated extends DomainEvent {
    private final String name;
    private final Float price;
    private final Boolean inStock;
    private final String image;
    private final String description;
    private final Date estimateTime;
    private final String shippingType;
    private final String publisher;
    private final String location;

    public ProductCreated(String name, Float price, Boolean inStock, String image, String description,
                          Date estimateTime, String shippingType, String publisher, String location,) {
        super("eCommerce.productCreated");
        this.price = price;
        this.inStock = inStock;
        this.image = image;
        this.description = description;
        this.estimateTime = estimateTime;
        this.shippingType = shippingType;
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

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public Date getEstimateTime() {
        return estimateTime;
    }

    public String getShippingType() {
        return shippingType;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getLocation() {
        return location;
    }
}