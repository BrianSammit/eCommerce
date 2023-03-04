package com.brian.eCommerce.business.orders;

import com.brian.eCommerce.business.commons.EventRepository;
import com.brian.eCommerce.business.commons.UseCaseForCommand;
import com.brian.eCommerce.domain.orders.Order;
import com.brian.eCommerce.domain.orders.command.AddProductCommand;
import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.DomainEvent;

import java.util.List;
import java.util.stream.Collectors;

public class AddProductUseCase implements UseCaseForCommand<AddProductCommand> {
    private  final EventRepository eventRepository;

    public AddProductUseCase(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<DomainEvent> apply(AddProductCommand command) {
        List<DomainEvent> orderEvent = eventRepository.findByAggregatedRootId(command.getProductID());
        Order order = Order.from(OrderID.of(command.getOrderID()), orderEvent);
        order.addProduct(ProductID.of(command.getProductID()),
                new Name(command.getName()),
                new Price(command.getPrice()),
                new Description(command.getDescription()),
                new Location(command.getLocation()));
        return order.getUncommittedChanges().stream().map(eventRepository::saveEvent).collect(Collectors.toList());
    }
}
