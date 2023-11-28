package com.model.download.system.download.service.domain;

import com.model.download.system.domain.valueobject.*;
import com.model.download.system.download.service.domain.dto.create.CreateDownloadCommand;
import com.model.download.system.download.service.domain.dto.create.CreateDownloadResponse;
import com.model.download.system.download.service.domain.dto.create.DownloadItem;
import com.model.download.system.download.service.domain.entity.Category;
import com.model.download.system.download.service.domain.entity.Customer;
import com.model.download.system.download.service.domain.entity.Download;
import com.model.download.system.download.service.domain.entity.Model;
import com.model.download.system.download.service.domain.exception.DownloadDomainException;
import com.model.download.system.download.service.domain.mapper.DownloadDataMapper;
import com.model.download.system.download.service.domain.ports.input.service.DownloadApplicationService;
import com.model.download.system.download.service.domain.ports.output.repository.CategoryRepository;
import com.model.download.system.download.service.domain.ports.output.repository.CustomerRepository;
import com.model.download.system.download.service.domain.ports.output.repository.DownloadRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest(classes = DownloadTestConfiguration.class)
public class DownloadApplicationServiceTest {

    @Autowired
    private DownloadApplicationService downloadApplicationService;
    @Autowired
    private DownloadDataMapper downloadDataMapper;
    @Autowired
    private DownloadRepository downloadRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CategoryRepository categoryRepository;


    private CreateDownloadCommand createDownloadCommand;
    private CreateDownloadCommand createDownloadCommandWrongPrice;
    private CreateDownloadCommand createDownloadCommandWrongModelPrice;
    private final UUID CUSTOMER_ID = UUID.fromString("d215b5f8-0249-4dc5-89a3-51fd148cfb41");
    private final UUID CATEGORY_ID = UUID.fromString("d215b5f8-0249-4dc5-89a3-51fd148cfb45");
    private final UUID MODEL_ID = UUID.fromString("d215b5f8-0249-4dc5-89a3-51fd148cfb48");
    private final UUID DOWNLOAD_ID = UUID.fromString("15a497c1-0f4b-4eff-b9f4-c402c8c07afb");
    private final BigDecimal PRICE = new BigDecimal("200.00");

    @BeforeAll
    public void init() {
        createDownloadCommand = CreateDownloadCommand.builder()
                .customerId(CUSTOMER_ID)
                .categoryId(CATEGORY_ID)
                .price(PRICE)
                .items(List.of(DownloadItem.builder()
                                .modelId(MODEL_ID)
                                .quantity(1)
                                .price(new BigDecimal("50.00"))
                                .subTotal(new BigDecimal("50.00"))
                                .build(),
                        DownloadItem.builder()
                                .modelId(MODEL_ID)
                                .quantity(3)
                                .price(new BigDecimal("50.00"))
                                .subTotal(new BigDecimal("150.00"))
                                .build()))
                .build();

        createDownloadCommandWrongPrice = CreateDownloadCommand.builder()
                .customerId(CUSTOMER_ID)
                .categoryId(CATEGORY_ID)
                .price(new BigDecimal("299.99"))
                .items(List.of(DownloadItem.builder()
                                .modelId(MODEL_ID)
                                .quantity(1)
                                .price(new BigDecimal("50.00"))
                                .subTotal(new BigDecimal("50.00"))
                                .build(),
                        DownloadItem.builder()
                                .modelId(MODEL_ID)
                                .quantity(3)
                                .price(new BigDecimal("50.00"))
                                .subTotal(new BigDecimal("150.00"))
                                .build()))
                .build();

        createDownloadCommandWrongModelPrice = CreateDownloadCommand.builder()
                .customerId(CUSTOMER_ID)
                .categoryId(CATEGORY_ID)
                .price(new BigDecimal("210.00"))
                .items(List.of(DownloadItem.builder()
                                .modelId(MODEL_ID)
                                .quantity(1)
                                .price(new BigDecimal("60.00"))
                                .subTotal(new BigDecimal("60.00"))
                                .build(),
                        DownloadItem.builder()
                                .modelId(MODEL_ID)
                                .quantity(3)
                                .price(new BigDecimal("50.00"))
                                .subTotal(new BigDecimal("150.00"))
                                .build()))
                .build();

        Customer customer = new Customer();
        customer.setId(new CustomerId(CUSTOMER_ID));

        Category category = new Category.Builder()
                .categoryId(new CategoryId(createDownloadCommand.getCategoryId()))
                .models(List.of(new Model(new ModelId(MODEL_ID), "model-1"
                                , "zip01", "image01",
                                new Money(new BigDecimal("50.00"))),
                        new Model(new ModelId(MODEL_ID), "model-2"
                                , "zip02", "image02",
                                new Money(new BigDecimal("50.00")))))
                .active(true)
                .build();

        Download download = downloadDataMapper.crateDownloadCommandToDownload(createDownloadCommand);
        download.setId(new DownloadId(DOWNLOAD_ID));

        when(customerRepository.findCustomer(CUSTOMER_ID)).thenReturn(Optional.of(customer));
        when(categoryRepository.findCategoryInformation(downloadDataMapper.createDownloadCommandToCategory(createDownloadCommand)))
                .thenReturn(Optional.of(category));
        when(downloadRepository.save(any(Download.class))).thenReturn(download);

    }

    @Test
    public void testDownloadOrder() {
        CreateDownloadResponse createDownloadResponse = downloadApplicationService.creteDownload(createDownloadCommand);
        assertEquals(DownloadStatus.PENDING, createDownloadResponse.getDownloadStatus());
        assertEquals("Download Created Successfully", createDownloadResponse.getMessage());
        assertNotNull(createDownloadResponse.getDownloadTrackingId());
    }

    @Test
    public void testCreateOrderWithWrongTotalPrice() {
        DownloadDomainException orderDomainException = assertThrows(DownloadDomainException.class,
                () -> downloadApplicationService.creteDownload(createDownloadCommandWrongPrice));
        assertEquals("Total price: 299.99 is not equal to Download Items total: 200.00!", orderDomainException.getMessage());
    }

    @Test
    public void testCreateOrderWithWrongProductPrice() {
        DownloadDomainException orderDomainException = assertThrows(DownloadDomainException.class,
                () -> downloadApplicationService.creteDownload(createDownloadCommandWrongModelPrice));
        assertEquals("Download item price: 60.00 is not valid for model " + MODEL_ID, orderDomainException.getMessage());
    }





}
