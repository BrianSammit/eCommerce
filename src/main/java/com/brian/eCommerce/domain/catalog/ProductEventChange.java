package com.brian.eCommerce.domain.catalog;

import com.brian.eCommerce.domain.catalog.events.ProductCreated;
import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.EventChange;

public class ProductEventChange extends EventChange {
    public ProductEventChange(Product product){
        apply((ProductCreated event) -> {
            product.name = new Name(event.getName());
            product.price = new Price(event.getPrice());
            product.description = new Description(event.getDescription());
            product.location = new Location(event.getLocation());
        });
    }
}
