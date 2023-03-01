package com.brian.eCommerce.domain;

import com.brian.eCommerce.domain.values.ProductID;
import com.brian.eCommerce.generic.Entity;

import java.util.List;

public class Product extends Entity<ProductID> {

    private List<Category> categories;

    public Product(ProductID id, List<Category> categories) {
        super(id);
        this.categories = categories;
    }
}
