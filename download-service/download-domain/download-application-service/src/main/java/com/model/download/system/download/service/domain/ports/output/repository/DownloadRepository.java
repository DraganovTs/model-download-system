package com.model.download.system.download.service.domain.ports.output.repository;

import com.model.download.system.download.service.domain.entity.Download;
import com.model.download.system.download.service.domain.valueobject.TrackingId;

import java.util.Optional;

public interface DownloadRepository {

    Download save(Download download);

    Optional<Download> findByTrackingId(TrackingId trackingId);
}
