package com.brian.eCommerce.domain.orders.events;

import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.DomainEvent;

public class ProductAdded extends DomainEvent {

    protected ProductID productID;
    protected Name name;
    protected Price price;
    protected Description description;
    protected Location location;

    public ProductAdded(ProductID productID, Name name, Price price, Description description,
                        Location location) {
        super("eCommerce.productAdded");
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.description = description;
        this.location = location;
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
}
