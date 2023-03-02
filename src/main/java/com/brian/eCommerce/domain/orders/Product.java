package com.brian.eCommerce.domain.orders;

import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.Entity;

public class Product extends Entity<ProductID> {
    protected Name name;
    protected Price price;
    protected Description description;
    protected Location location;

    protected  Quantity quantity;

    public Product(ProductID id, Name name, Price price, Description description, Location location, Quantity quantity) {
        super(id);
        this.name = name;
        this.price = price;
        this.description = description;
        this.location = location;
        this.quantity = quantity;
    }

    public Name getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }

    public Description getDescription() {
        return description;
    }

    public Location getLocation() {
        return location;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
