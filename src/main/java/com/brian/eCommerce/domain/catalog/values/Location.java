package com.brian.eCommerce.domain.catalog.values;

import com.brian.eCommerce.generic.ValueObject;

import java.util.Objects;

public class Location implements ValueObject<String> {
    private final String value;

    public Location(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isEmpty()) {
            throw new IllegalArgumentException("The location is not valid");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
