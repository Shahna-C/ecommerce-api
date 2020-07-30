package com.sc.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.sc.ecommerce.entity.Order;

public interface OrderRepository extends CrudRepository <Order, Long> {

}
