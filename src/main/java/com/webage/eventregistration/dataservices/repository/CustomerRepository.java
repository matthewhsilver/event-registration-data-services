package com.webage.eventregistration.dataservices.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.webage.eventregistration.dataservices.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	public Optional<Customer> findByName(String name);
	
}
