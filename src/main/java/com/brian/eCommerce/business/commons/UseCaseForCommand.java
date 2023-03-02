package com.brian.eCommerce.business.commons;

import com.brian.eCommerce.generic.Command;
import com.brian.eCommerce.generic.DomainEvent;

import java.util.List;

public interface UseCaseForCommand <T extends Command>{
    List<DomainEvent> apply(T command);
}
