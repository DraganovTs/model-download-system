package com.model.download.system.download.service.domain.ports.input.message.listener.categoryapproval;

import com.model.download.system.download.service.domain.dto.message.CategoryApprovalResponse;

public interface CategoryApprovalResponseMessageListener {

    void downloadApproved(CategoryApprovalResponse categoryApprovalResponse);

    void downloadRejected(CategoryApprovalResponse categoryApprovalResponse);
}
