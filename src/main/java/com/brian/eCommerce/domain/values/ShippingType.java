package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class ShippingType implements ValueObject<String> {

    private final String value;

    public ShippingType(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isEmpty()){
            throw new IllegalArgumentException("The shipping type is not valid");
        }
    }
    @Override
    public String value() {
        return value;
    }
}
