package com.brian.eCommerce.domain.catalog;

import com.brian.eCommerce.domain.catalog.events.ProductCreated;
import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.AggregateRoot;
import com.brian.eCommerce.generic.DomainEvent;

import java.util.List;

public class Product extends AggregateRoot<ProductID> {
    protected Name name;
    protected Price price;
    protected InStock inStock;
    protected Description description;
    protected Publisher publisher;
    protected Location location;
    public Product(ProductID id, String name, Float price, Boolean inStock, String description,
                   String publisher, String location) {
        super(id);
        subscribe(new ProductEventChange(this));
        appendChange(new ProductCreated(name, price, inStock, description, publisher, location));
    }

    public Product(ProductID id) {
        super(id);
        subscribe(new ProductEventChange(this));
    }

    public static Product myProduct(ProductID id, List<DomainEvent> events){
        Product product = new Product(id);
        events.forEach(product::applyEvent);
        return product;
    }
}
