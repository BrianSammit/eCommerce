package com.brian.eCommerce.domain.catalog.values;

import com.brian.eCommerce.generic.Identity;

public class CategoryID extends Identity {
    public CategoryID(){}
    private CategoryID(String id) {
        super(id);
    }
    public static CategoryID of(String id) {
        return new CategoryID(id);
    }
}
