package com.sc.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.sc.ecommerce.entity.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long> {

}
