package com.model.download.system.download.service.domain.dto.message;

import com.model.download.system.domain.valueobject.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class PaymentResponse {
    private String id;
    private String sagaId;
    private String downloadId;
    private String paymentId;
    private String customerId;
    private BigDecimal price;
    private Integer createdAt;
    private PaymentStatus paymentStatus;
    private List<String> failureMessages;
}
