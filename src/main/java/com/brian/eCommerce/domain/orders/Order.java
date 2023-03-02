package com.brian.eCommerce.domain.orders;

import com.brian.eCommerce.domain.orders.events.OrderCreated;
import com.brian.eCommerce.domain.orders.events.ProductAdded;
import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.AggregateRoot;
import com.brian.eCommerce.generic.DomainEvent;

import java.util.List;
public class Order extends AggregateRoot<OrderID> {
    protected OrderDate date;
    protected Status status;
    protected CostumerID costumerID;
    protected ShippingAddress shippingAddress;

    public Order(OrderID id, OrderDate date, Status status, CostumerID costumerID, ShippingAddress shippingAddress) {
        super(id);
        this.date = date;
        this.status = status;
        this.costumerID = costumerID;
        this.shippingAddress = shippingAddress;
        subscribe(new OrderEventChange(this));
        appendChange(new OrderCreated(date.value(), status.value(), costumerID.value(), shippingAddress.value()));
    }

    public Order(OrderID id) {
        super(id);
        subscribe(new OrderEventChange(this));
    }

    public static Order myProduct(OrderID id, List<DomainEvent> events){
        Order product = new Order(id);
        events.forEach(product::applyEvent);
        return product;
    }

    public static Order from(OrderID id, List<DomainEvent> events){
        Order order = new Order(id);
        events.forEach(order::applyEvent);
        return order;
    }

    public void addProduct(ProductID id, Name name, Price price, Description description,
                           Location location, Quantity quantity){
        appendChange(new ProductAdded(id, name, price, description, location, quantity ));
    }
}
