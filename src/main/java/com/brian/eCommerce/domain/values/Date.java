package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.ValueObject;

import java.util.Objects;

public class Date implements ValueObject<Date> {

    private final Date value;

    public Date(Date value) {
        this.value = Objects.requireNonNull(value);
        if(this.value == null){
            throw new IllegalArgumentException("The Date is not valid");
        }
    }
    @Override
    public Date value() {
        return value;
    }
}
