package com.model.download.system.download.service.domain.dto.create;

import com.model.download.system.domain.valueobject.DownloadStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class CreateDownloadResponse {
    @NotNull
    private final UUID downloadTrackingId;
    @NotNull
    private final DownloadStatus downloadStatus;
    @NotNull
    private final String message;
}
