package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.Identity;

public class ProductID extends Identity {

    public ProductID(){}
    private ProductID(String id) {
        super(id);
    }
    public static ProductID of(String id) {
        return new ProductID(id);
    }
}
