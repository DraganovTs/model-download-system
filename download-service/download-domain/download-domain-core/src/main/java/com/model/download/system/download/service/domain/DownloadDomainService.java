package com.model.download.system.download.service.domain;

import com.model.download.system.download.service.domain.entity.Category;
import com.model.download.system.download.service.domain.entity.Download;
import com.model.download.system.download.service.domain.event.DownloadCancelEvent;
import com.model.download.system.download.service.domain.event.DownloadCreatedEvent;
import com.model.download.system.download.service.domain.event.DownloadPaidEvent;

import java.util.List;

public interface DownloadDomainService {

    DownloadCreatedEvent validateAndInitiateDownload(Download download, Category category);

    DownloadPaidEvent payDownload(Download download);

    void approveDownload(Download download);

    DownloadCancelEvent cancelDownloadPayment(Download download, List<String> failureMessages);

    void cancelDownload(Download download, List<String> failureMessages);
}
