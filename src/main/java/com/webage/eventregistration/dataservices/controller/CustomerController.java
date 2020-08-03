package com.webage.eventregistration.dataservices.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webage.eventregistration.dataservices.domain.Customer;
import com.webage.eventregistration.dataservices.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	public Collection<Customer> findAllCustomers() {
		return customerService.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Customer> findCustomerById(@PathVariable("id") Long id) {
		return ResponseEntity.of(customerService.findById(id));
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<Customer> findCustomerByName(@PathVariable("name") String name) {
		return ResponseEntity.of(customerService.findByName(name));
	}
	
}
