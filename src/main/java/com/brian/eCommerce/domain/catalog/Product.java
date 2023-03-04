package com.brian.eCommerce.domain.catalog;

import com.brian.eCommerce.domain.catalog.events.ProductCreated;
import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.AggregateRoot;
import com.brian.eCommerce.generic.DomainEvent;

import java.util.List;

public class Product extends AggregateRoot<ProductID> {
    protected Name name;
    protected Price price;
    protected Description description;
    protected Location location;
    public Product(ProductID id, Name name, Price price,  Description description, Location location) {
        super(id);
        subscribe(new ProductEventChange(this));
        appendChange(new ProductCreated(name.value(), price.value(), description.value(), location.value())).apply();
    }

    public Product(ProductID id) {
        super(id);
        subscribe(new ProductEventChange(this));
    }

    public static Product from(ProductID id, List<DomainEvent> events){
        Product product = new Product(id);
        events.forEach(product::applyEvent);
        return product;
    }
}
