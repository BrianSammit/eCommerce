package com.brian.eCommerce.domain.orders;

import com.brian.eCommerce.domain.catalog.Product;
import com.brian.eCommerce.domain.orders.events.OrderCreated;
import com.brian.eCommerce.domain.orders.events.ProductAdded;
import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.AggregateRoot;
import com.brian.eCommerce.generic.DomainEvent;

import java.util.List;
import java.util.Objects;

public class Order extends AggregateRoot<OrderID> {
//    protected OrderDate date;
    protected Status status;
    protected ShippingAddress shippingAddress;
    protected UserId userID;
    protected List<Product> products;

    public Order(OrderID id,  Status status, ShippingAddress shippingAddress, UserId userID,
                 ProductID productID, Quantity quantity) {
        super(id);
        subscribe(new OrderEventChange(this));
        appendChange(new OrderCreated( status.value(), shippingAddress.value(), userID.value(),
                productID.value(), quantity.value())).apply();
    }

    public Order(OrderID id) {
        super(id);
        subscribe(new OrderEventChange(this));
    }

    public static Order from(OrderID id, List<DomainEvent> events){
        Order order = new Order(id);
        events.forEach(order::applyEvent);
        return order;
    }

    public void addProduct(ProductID id, Name name, Price price, Description description,
                           Location location){
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        Objects.requireNonNull(price);
        Objects.requireNonNull(description);
        Objects.requireNonNull(location);
        appendChange(new ProductAdded(id.value(), name.value(), price.value(), description.value(), location.value())).apply();
    }
}
