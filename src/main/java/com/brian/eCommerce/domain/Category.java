package com.brian.eCommerce.domain;

import com.brian.eCommerce.domain.values.CategoryID;
import com.brian.eCommerce.generic.Entity;

import java.util.List;

public class Category extends Entity<CategoryID> {

    private List<Product> products;
    public Category(CategoryID id, List<Product> products) {
        super(id);
        this.products = products;
    }
}
