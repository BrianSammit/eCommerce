package com.brian.eCommerce.domain.orders;

import com.brian.eCommerce.domain.orders.events.OrderCreated;
import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.EventChange;

import java.util.Date;

public class OrderEventChange extends EventChange {
    public OrderEventChange(Order order){
        apply((OrderCreated event) -> {
            order.date = new OrderDate(event.getDate());
            order.status = new Status(event.getStatus());
            order.costumerID = CostumerID.of(event.getCostumerID());
            order.shippingAddress = new ShippingAddress(event.getShippingAddress());
        });
    }
}
