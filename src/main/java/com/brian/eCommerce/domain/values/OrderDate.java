package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.ValueObject;

import java.util.Objects;

public class OrderDate implements ValueObject<OrderDate> {

    private final OrderDate value;

    public OrderDate(OrderDate value) {
        this.value = Objects.requireNonNull(value);
        if(this.value == null){
            throw new IllegalArgumentException("The Date is not valid");
        }
    }
    @Override
    public OrderDate value() {
        return value;
    }
}
