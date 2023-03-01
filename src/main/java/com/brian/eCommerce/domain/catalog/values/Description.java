package com.brian.eCommerce.domain.catalog.values;

import com.brian.eCommerce.generic.ValueObject;

import java.util.Objects;

public class Description implements ValueObject<String> {

    private final String value;

    public Description(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isEmpty()){
            throw new IllegalArgumentException("The description is not valid");
        }
    }
    @Override
    public String value() {
        return value;
    }
}
