package com.model.download.system.domain.event.publisher;

import com.model.download.system.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {

    void publish(T domainEvent);
}
