package com.model.download.system.download.service.domain.ports.output.repository;

import com.model.download.system.download.service.domain.entity.Customer;

import java.util.Optional;
import java.util.UUID;

public interface CustomerRepository {

    Optional<Customer> findCustomer(UUID customerId);
}
