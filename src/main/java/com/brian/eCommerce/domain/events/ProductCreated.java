package com.brian.eCommerce.domain.events;

import com.brian.eCommerce.generic.DomainEvent;

public class ProductCreated extends DomainEvent {
    public ProductCreated() {
        super("eCommerce.productCreated");
    }
}
