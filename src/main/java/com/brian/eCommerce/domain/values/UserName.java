package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.ValueObject;

import java.util.Objects;

public class UserName implements ValueObject<String> {
    private final String value;

    public UserName(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isEmpty()){
            throw new IllegalArgumentException("The status is not valid");
        }
    }
    @Override
    public String value() {
        return value;
    }
}
