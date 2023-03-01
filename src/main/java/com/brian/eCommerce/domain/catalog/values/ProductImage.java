package com.brian.eCommerce.domain.catalog.values;

import com.brian.eCommerce.generic.ValueObject;

import java.util.Objects;

public class ProductImage implements ValueObject<String> {

    private final String value;

    public ProductImage(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isEmpty()){
            throw new IllegalArgumentException("The image is not valid");
        }
    }
    @Override
    public String value() {
        return value;
    }
}
