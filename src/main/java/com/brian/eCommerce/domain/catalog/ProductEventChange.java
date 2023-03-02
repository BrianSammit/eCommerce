package com.brian.eCommerce.domain.catalog;

import com.brian.eCommerce.domain.catalog.events.ProductCreated;
import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.EventChange;

public class ProductEventChange extends EventChange {
    public ProductEventChange(Product product){
        apply((ProductCreated event) -> {
            product.name = new Name(event.getName());
            product.price = new Price(event.getPrice());
            product.inStock = new InStock(event.getInStock());
            product.description = new Description(event.getDescription());
            product.publisher = new Publisher(event.getPublisher());
            product.location = new Location(event.getLocation());
        });
    }
}
