package com.model.download.system.download.service.domain;

import com.model.download.system.download.service.domain.ports.output.message.publisher.categoryapproval.DownloadPaidCategoryRequestMessagePublisher;
import com.model.download.system.download.service.domain.ports.output.message.publisher.payment.DownloadCancelledPaymentRequestMessagePublisher;
import com.model.download.system.download.service.domain.ports.output.message.publisher.payment.DownloadCreatedPaymentRequestMessagePublisher;
import com.model.download.system.download.service.domain.ports.output.repository.CategoryRepository;
import com.model.download.system.download.service.domain.ports.output.repository.CustomerRepository;
import com.model.download.system.download.service.domain.ports.output.repository.DownloadRepository;
import org.mockito.Mockito;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.model.download.system.download.service.domain")
public class DownloadTestConfiguration {

    @Bean
    public DownloadCreatedPaymentRequestMessagePublisher paymentRequestMessagePublisher() {
        return Mockito.mock(DownloadCreatedPaymentRequestMessagePublisher.class);
    }

    @Bean
    public DownloadCancelledPaymentRequestMessagePublisher restaurantApprovalRequestMessagePublisher() {
        return Mockito.mock(DownloadCancelledPaymentRequestMessagePublisher.class);
    }

    @Bean
    public DownloadPaidCategoryRequestMessagePublisher paidCategoryRequestMessagePublisher() {
        return Mockito.mock(DownloadPaidCategoryRequestMessagePublisher.class);
    }

    @Bean
    public DownloadRepository orderRepository() {
        return Mockito.mock(DownloadRepository.class);
    }

    @Bean
    public CustomerRepository customerRepository() {
        return Mockito.mock(CustomerRepository.class);
    }

    @Bean
    public CategoryRepository restaurantRepository() {
        return Mockito.mock(CategoryRepository.class);
    }

    @Bean
    public DownloadDomainService downloadDomainService() {
        return new DownloadDomainServiceImpl();
    }


}
