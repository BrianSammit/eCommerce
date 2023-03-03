package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.ValueObject;

import java.util.Objects;

public class InStock implements ValueObject<Boolean> {

    private final Boolean value;

    public InStock(Boolean value) {
        this.value = Objects.requireNonNull(value);
    }
    @Override
    public Boolean value() {
        return value;
    }
}
