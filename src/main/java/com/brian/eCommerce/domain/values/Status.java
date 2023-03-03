package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.ValueObject;

import java.util.Objects;

public class Status implements ValueObject<String> {

    private final String value;

    public Status(String value) {
        this.value = Objects.requireNonNull(value);
    }
    @Override
    public String value() {
        return value;
    }
}
