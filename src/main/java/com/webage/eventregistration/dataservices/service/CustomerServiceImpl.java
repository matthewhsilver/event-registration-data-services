package com.webage.eventregistration.dataservices.service;

import java.util.Collection;
import java.util.Optional;

import com.webage.eventregistration.dataservices.domain.Customer;
import com.webage.eventregistration.dataservices.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public Collection<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public Optional<Customer> findById(Long id) {
		return customerRepository.findById(id);
	}

	@Override
	public Optional<Customer> findByName(String name) {
		return customerRepository.findByName(name);
	}

}
