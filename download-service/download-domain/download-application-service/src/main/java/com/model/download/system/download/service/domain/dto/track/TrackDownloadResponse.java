package com.model.download.system.download.service.domain.dto.track;

import com.model.download.system.domain.valueobject.DownloadStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class TrackDownloadResponse {
    @NotNull
    private final UUID downloadTrackingId;
    @NotNull
    private final DownloadStatus downloadStatus;
    private final List<String> failureMessages;
}
