package com.sc.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.sc.ecommerce.entity.Customer;

public interface CustomerRepository extends CrudRepository <Customer, Long> {

}
