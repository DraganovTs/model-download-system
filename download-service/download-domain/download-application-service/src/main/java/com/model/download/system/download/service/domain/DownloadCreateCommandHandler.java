package com.model.download.system.download.service.domain;

import com.model.download.system.download.service.domain.dto.create.CreateDownloadCommand;
import com.model.download.system.download.service.domain.dto.create.CreateDownloadResponse;
import com.model.download.system.download.service.domain.event.DownloadCreatedEvent;
import com.model.download.system.download.service.domain.mapper.DownloadDataMapper;
import com.model.download.system.download.service.domain.ports.output.message.publisher.payment.DownloadCreatedPaymentRequestMessagePublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
public class DownloadCreateCommandHandler {


    private final DownloadCreateHelper downloadCreateHelper;

    private final DownloadDataMapper downloadDataMapper;
    private final DownloadCreatedPaymentRequestMessagePublisher downloadCreatedPaymentRequestMessagePublisher;

    public DownloadCreateCommandHandler(DownloadCreateHelper downloadCreateHelper,
                                        DownloadDataMapper downloadDataMapper,
                                        DownloadCreatedPaymentRequestMessagePublisher
                                                downloadCreatedPaymentRequestMessagePublisher) {
        this.downloadCreateHelper = downloadCreateHelper;
        this.downloadDataMapper = downloadDataMapper;
        this.downloadCreatedPaymentRequestMessagePublisher = downloadCreatedPaymentRequestMessagePublisher;
    }


    public CreateDownloadResponse createDownload(CreateDownloadCommand createDownloadCommand) {
        DownloadCreatedEvent downloadCreatedEvent = downloadCreateHelper.persistDownload(createDownloadCommand);
        log.info("Download is created whit id: {}" ,downloadCreatedEvent.getDownload().getId().getValue());
        downloadCreatedPaymentRequestMessagePublisher.publish(downloadCreatedEvent);
        return downloadDataMapper.downloadToCreateDownloadResponse(downloadCreatedEvent.getDownload(), "Download Created Successfully");
    }


}
