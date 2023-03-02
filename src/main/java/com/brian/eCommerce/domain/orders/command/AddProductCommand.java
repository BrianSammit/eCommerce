package com.brian.eCommerce.domain.orders.command;

import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.Command;

public class AddProductCommand extends Command {
    protected ProductID productID;
    protected Name name;
    protected Price price;
    protected Description description;
    protected Location location;
    protected Quantity quantity;

    public ProductID getProductID() {
        return productID;
    }

    public void setProductID(ProductID productID) {
        this.productID = productID;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }
}
