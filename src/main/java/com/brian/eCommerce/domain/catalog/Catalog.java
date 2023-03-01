package com.brian.eCommerce.domain.catalog;

import com.brian.eCommerce.domain.catalog.values.CatalogID;
import com.brian.eCommerce.generic.AggregateRoot;

public class Catalog extends AggregateRoot<CatalogID> {
    public Catalog(CatalogID id) {
        super(id);
    }
}
