package com.sc.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.sc.ecommerce.entity.Product;

public interface ProductRepository extends CrudRepository <Product, Long> {

}
