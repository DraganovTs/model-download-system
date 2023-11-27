package com.model.download.system.download.service.domain.dto.track;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class TrackDownloadQuery {
    @NotNull
    private final UUID downloadTrackingId;

}
