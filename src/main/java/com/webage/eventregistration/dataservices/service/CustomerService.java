package com.webage.eventregistration.dataservices.service;

import java.util.Optional;

import com.webage.eventregistration.dataservices.domain.Customer;

public interface CustomerService {

	public Iterable<Customer> findAll();
	
	public Optional<Customer> findById(Long id);
	
	public Optional<Customer> findByName(String name);
	
	public Customer saveCustomer(Customer customer);
	
	public void deleteCustomer(Long id);
}
