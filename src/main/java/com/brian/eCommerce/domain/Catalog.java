package com.brian.eCommerce.domain;

import com.brian.eCommerce.domain.values.CatalogID;
import com.brian.eCommerce.generic.AggregateRoot;

public class Catalog extends AggregateRoot<CatalogID> {
    public Catalog(CatalogID id) {
        super(id);
    }
}
