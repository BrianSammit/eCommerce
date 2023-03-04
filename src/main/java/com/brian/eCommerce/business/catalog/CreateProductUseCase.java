package com.brian.eCommerce.business.catalog;

import com.brian.eCommerce.business.commons.EventRepository;
import com.brian.eCommerce.business.commons.UseCaseForCommand;
import com.brian.eCommerce.domain.catalog.Product;
import com.brian.eCommerce.domain.catalog.command.CreateProductCommand;
import com.brian.eCommerce.domain.values.*;
import com.brian.eCommerce.generic.DomainEvent;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CreateProductUseCase implements UseCaseForCommand<CreateProductCommand> {

    private final EventRepository eventRepository;

    public CreateProductUseCase(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<DomainEvent> apply(CreateProductCommand command) {
        Product product = new Product(
                ProductID.of(command.getProductID()),
                new Name(command.getName()),
                new Price(command.getPrice()),
                new Description(command.getDescription()),
                new Location(command.getLocation()));
        return product.getUncommittedChanges().stream().map(eventRepository::saveEvent).collect(Collectors.toList());
    }
}
