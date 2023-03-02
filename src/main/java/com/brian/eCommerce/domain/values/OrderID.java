package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.Identity;

public class OrderID extends Identity {
    public OrderID(){}
    private OrderID(String id) {
        super(id);
    }
    public static OrderID of(String id) {
        return new OrderID(id);
    }
}
