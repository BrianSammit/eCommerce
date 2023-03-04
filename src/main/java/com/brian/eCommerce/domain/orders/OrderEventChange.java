package com.brian.eCommerce.domain.orders;

import com.brian.eCommerce.domain.catalog.Product;
import com.brian.eCommerce.domain.orders.events.OrderCreated;
import com.brian.eCommerce.domain.orders.events.ProductAdded;
import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.EventChange;

import java.util.ArrayList;

public class OrderEventChange extends EventChange {
    public OrderEventChange(Order order){
        apply((OrderCreated event) -> {
            order.status = new Status(event.getStatus());
            order.shippingAddress = new ShippingAddress(event.getShippingAddress());
            order.userID = UserId.of(event.getUserID());
            order.products = new ArrayList<>();
        });

        apply((ProductAdded event) -> {
            Product product = new Product(event.getProductID(), event.getName(), event.getPrice(),
                    event.getDescription(), event.getLocation());
            order.products.add(product);
        });
    }
}
