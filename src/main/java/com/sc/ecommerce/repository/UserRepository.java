package com.sc.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.sc.ecommerce.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

	public User findByUsername(String username);
	

}
