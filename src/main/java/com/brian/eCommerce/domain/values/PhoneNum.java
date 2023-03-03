package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.ValueObject;

import java.util.Objects;

public class PhoneNum implements ValueObject<Integer> {
    private final Integer value;

    public PhoneNum(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value < 0){
            throw new IllegalArgumentException();
        }
    }
    @Override
    public Integer value() {
        return value;
    }
}
