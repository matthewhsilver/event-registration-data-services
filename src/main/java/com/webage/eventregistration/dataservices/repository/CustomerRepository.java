package com.webage.eventregistration.dataservices.repository;

import java.util.Collection;
import java.util.Optional;

import com.webage.eventregistration.dataservices.domain.Customer;

public interface CustomerRepository {

	public Collection<Customer> findAll();
	
	public Optional<Customer> findById(Long id);
	
	public Optional<Customer> findByName(String name);
	
}
