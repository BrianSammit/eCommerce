package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.ValueObject;

import java.util.Objects;

public class Status implements ValueObject<Boolean> {

    private final Boolean value;

    public Status(Boolean value) {
        this.value = Objects.requireNonNull(value);
        if(this.value == null){
            throw new IllegalArgumentException("The status is not valid");
        }
    }
    @Override
    public Boolean value() {
        return value;
    }
}
