package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.ValueObject;

import java.util.Objects;

public class Name implements ValueObject<String> {
    private final String value;

    public Name(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isEmpty()){
            throw new IllegalArgumentException();
        }
    }
    @Override
    public String value() {
        return value;
    }
}
