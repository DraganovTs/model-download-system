package com.model.download.system.download.service.domain.mapper;

import com.model.download.system.domain.valueobject.CategoryId;
import com.model.download.system.domain.valueobject.CustomerId;
import com.model.download.system.domain.valueobject.ModelId;
import com.model.download.system.domain.valueobject.Money;
import com.model.download.system.download.service.domain.dto.create.CreateDownloadCommand;
import com.model.download.system.download.service.domain.dto.create.CreateDownloadResponse;
import com.model.download.system.download.service.domain.dto.track.TrackDownloadResponse;
import com.model.download.system.download.service.domain.entity.Category;
import com.model.download.system.download.service.domain.entity.Download;
import com.model.download.system.download.service.domain.entity.DownloadItem;
import com.model.download.system.download.service.domain.entity.Model;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DownloadDataMapper {

    public Category createDownloadCommandToCategory(CreateDownloadCommand createDownloadCommand) {
        return Category.Builder.builder()
                .categoryId(new CategoryId(createDownloadCommand.getCategoryId()))
                .models(createDownloadCommand.getItems().stream().map(downloadItem ->
                                new Model(new ModelId(downloadItem.getModelId())))
                        .collect(Collectors.toList()))
                .build();
    }

    public Download crateDownloadCommandToDownload(CreateDownloadCommand createDownloadCommand) {
        return Download.Builder.builder()
                .customerId(new CustomerId(createDownloadCommand.getCustomerId()))
                .categoryId(new CategoryId(createDownloadCommand.getCategoryId()))
                .price(new Money(createDownloadCommand.getPrice()))
                .items(downloadItemsToDownloadItemsEntities(createDownloadCommand.getItems()))
                .build();

    }

    public CreateDownloadResponse downloadToCreateDownloadResponse(Download download) {
        return CreateDownloadResponse.builder()
                .downloadTrackingId(download.getTrackingId().getValue())
                .downloadStatus(download.getDownloadStatus())
                .build();
    }

    public TrackDownloadResponse downloadToTrackDownloadResponse(Download download){
        return TrackDownloadResponse.builder()
                .downloadTrackingId(download.getTrackingId().getValue())
                .downloadStatus(download.getDownloadStatus())
                .failureMessages(download.getFailureMessages())
                .build();
    }

    private List<DownloadItem> downloadItemsToDownloadItemsEntities(List<com.model.download.system.download.service.domain.dto.create.DownloadItem> items) {
        return items.stream()
                .map(downloadItem ->
                        DownloadItem.Builder.builder()
                                .model(new Model(new ModelId(downloadItem.getModelId())))
                                .price(new Money(downloadItem.getPrice()))
                                .quantity(downloadItem.getQuantity())
                                .subTotal(new Money(downloadItem.getSubTotal()))
                                .build()).collect(Collectors.toList());
    }
}
