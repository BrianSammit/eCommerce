package com.brian.eCommerce.business.commons;

import com.brian.eCommerce.generic.DomainEvent;

import java.util.List;

public interface EventRepository {
    DomainEvent saveEvent(DomainEvent event);
    List<DomainEvent> findByAggregatedRootId(String aggregatedRootId);
}
