package com.webage.eventregistration.dataservices.service;

import java.util.Collection;
import java.util.Optional;

import com.webage.eventregistration.dataservices.domain.Customer;

public interface CustomerService {

	public Collection<Customer> findAll();
	
	public Optional<Customer> findById(Long id);
	
	public Optional<Customer> findByName(String name);
	
}
