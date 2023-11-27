package com.model.download.system.download.service.domain.ports.output.message.publisher.categoryapproval;

import com.model.download.system.domain.event.publisher.DomainEventPublisher;
import com.model.download.system.download.service.domain.event.DownloadPaidEvent;

public interface DownloadPaidCategoryRequestMessagePublisher extends DomainEventPublisher<DownloadPaidEvent> {
}
