package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.ValueObject;

import java.util.Objects;

public class Price implements ValueObject<Float> {

    private final Float value;

    public Price(Float value) {
        this.value = Objects.requireNonNull(value);
        if(this.value == null){
            throw new IllegalArgumentException("The price is not valid");
        }
    }
    @Override
    public Float value() {
        return value;
    }
}
