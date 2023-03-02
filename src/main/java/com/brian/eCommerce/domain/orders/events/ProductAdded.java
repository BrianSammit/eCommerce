package com.brian.eCommerce.domain.orders.events;

import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.DomainEvent;

public class ProductAdded extends DomainEvent {

    protected ProductID productID;
    protected Name name;
    protected Price price;
    protected Description description;
    protected Location location;
    protected Quantity quantity;

    public ProductAdded(ProductID productID, Name name, Price price, Description description,
                        Location location, Quantity quantity) {
        super("eCommerce.productAdded");
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.description = description;
        this.location = location;
        this.quantity = quantity;
    }

    public ProductID getProductID() {
        return productID;
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
