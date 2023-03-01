package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.ValueObject;

import java.util.Objects;

public class ProductName implements ValueObject<String> {
    private final String value;

    public ProductName(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isEmpty()){
            throw new IllegalArgumentException("The product name is not valid");
        }
    }
    @Override
    public String value() {
        return value;
    }
}
