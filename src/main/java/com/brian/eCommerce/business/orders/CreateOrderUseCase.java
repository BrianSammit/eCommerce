package com.brian.eCommerce.business.orders;

import com.brian.eCommerce.business.commons.EventRepository;
import com.brian.eCommerce.business.commons.UseCaseForCommand;
import com.brian.eCommerce.domain.orders.Order;
import com.brian.eCommerce.domain.orders.command.CreateOrderCommand;
import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.DomainEvent;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CreateOrderUseCase implements UseCaseForCommand<CreateOrderCommand> {

    private final EventRepository eventRepository;

    public CreateOrderUseCase(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<DomainEvent> apply(CreateOrderCommand command) {
        Order order = new Order(OrderID.of(command.getOrderID()), new OrderDate(command.getDate()),
                new Status(command.getStatus()), CostumerID.of(command.getOrderID()),
                new ShippingAddress(command.getShippingAddress()));
        return order.getUncommittedChanges().stream().map(eventRepository::saveEvent).collect(Collectors.toList());
    }
}
