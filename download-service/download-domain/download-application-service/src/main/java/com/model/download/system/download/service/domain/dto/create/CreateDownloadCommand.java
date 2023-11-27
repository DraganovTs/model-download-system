package com.model.download.system.download.service.domain.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class CreateDownloadCommand {
    @NotNull
    private final UUID customerId;
    @NotNull
    private final UUID categoryId;
    @NotNull
    private final BigDecimal price;
    @NotNull
    private final List<DownloadItem> items;
}
