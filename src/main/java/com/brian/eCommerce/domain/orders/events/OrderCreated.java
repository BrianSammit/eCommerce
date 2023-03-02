package com.brian.eCommerce.domain.orders.events;

import com.brian.eCommerce.domain.values.CostumerID;
import com.brian.eCommerce.domain.values.OrderDate;
import com.brian.eCommerce.domain.values.ShippingAddress;
import com.brian.eCommerce.domain.values.Status;
import com.brian.eCommerce.generic.DomainEvent;

public class OrderCreated extends DomainEvent {
    protected String date;
    protected Boolean status;
    protected String costumerID;
    protected String shippingAddress;

    public OrderCreated(String type, String date, Boolean status, String costumerID, String shippingAddress) {
        super("eCommerce.orderCreated");
        this.date = date;
        this.status = status;
        this.costumerID = costumerID;
        this.shippingAddress = shippingAddress;
    }
}
