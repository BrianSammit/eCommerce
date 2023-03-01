package com.brian.eCommerce.domain.catalog.values;

import com.brian.eCommerce.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class EstimatedShippingTime implements ValueObject<Date> {
    
    private final Date value;

    public EstimatedShippingTime(Date value) {
        this.value = Objects.requireNonNull(value);
        if(this.value == null){
            throw new IllegalArgumentException("The time is not valid");
        }
    }
    @Override
    public Date value() {
        return value;
    }
}
