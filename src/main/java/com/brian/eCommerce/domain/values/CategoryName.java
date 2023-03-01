package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.ValueObject;

import java.util.Objects;

public class CategoryName implements ValueObject<String> {

    private final String value;

    public CategoryName(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isEmpty()) {
            throw new IllegalArgumentException("The category name is not valid");
        }
    }
    @Override
    public String value() {
        return null;
    }
}
