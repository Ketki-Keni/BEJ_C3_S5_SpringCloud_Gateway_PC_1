package com.bej.product.repository;

import com.bej.product.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer,Integer> {
    Customer findByCustomerEmail(String customerEmail);
}
