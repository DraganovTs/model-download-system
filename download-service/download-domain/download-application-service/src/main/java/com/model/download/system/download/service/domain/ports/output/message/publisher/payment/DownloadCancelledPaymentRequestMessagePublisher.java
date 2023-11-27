package com.model.download.system.download.service.domain.ports.output.message.publisher.payment;

import com.model.download.system.domain.event.publisher.DomainEventPublisher;
import com.model.download.system.download.service.domain.event.DownloadCancelEvent;

public interface DownloadCancelledPaymentRequestMessagePublisher extends DomainEventPublisher<DownloadCancelEvent> {
}
