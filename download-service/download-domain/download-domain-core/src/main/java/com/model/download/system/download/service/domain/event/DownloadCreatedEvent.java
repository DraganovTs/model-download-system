package com.model.download.system.download.service.domain.event;

import com.model.download.system.download.service.domain.entity.Download;

import java.time.ZonedDateTime;

public class DownloadCreatedEvent extends DownloadEvent {


    public DownloadCreatedEvent(Download download, ZonedDateTime createdAt) {
        super(download, createdAt);
    }
}
