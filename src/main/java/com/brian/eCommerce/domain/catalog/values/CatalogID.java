package com.brian.eCommerce.domain.catalog.values;

import com.brian.eCommerce.generic.Identity;

public class CatalogID extends Identity {
    public CatalogID(){}
    private CatalogID(String id) {
        super(id);
    }
    public static CatalogID of(String id) {
        return new CatalogID(id);
    }
}
