package com.model.download.system.download.service.domain.dto.message;

import com.model.download.system.domain.valueobject.DownloadApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class CategoryApprovalResponse {
    private String id;
    private String sagaId;
    private String downloadId;
    private String categoryId;
    private Integer createdAt;
    private DownloadApprovalStatus downloadApprovalStatus;
    private List<String> failureMessages;
}
