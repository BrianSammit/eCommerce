package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class OrderDate implements ValueObject<Date> {

    private final Date value;

    public OrderDate(Date value) {
        this.value = Objects.requireNonNull(value);
    }
    @Override
    public Date value() {
        return value;
    }
}
