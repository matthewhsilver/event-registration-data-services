package com.webage.eventregistration.dataservices.controller;

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
	public Iterable<Customer> findAllCustomers() {
		return customerService.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Customer> findCustomerById(@PathVariable("id") Long id) {
		return ResponseEntity.of(customerService.findById(id));
	}
	
	@GetMapping("/name/{userName}")
	public ResponseEntity<Customer> findCustomerByUserName(@PathVariable("userName") String userName) {
		return ResponseEntity.of(customerService.findByUserName(userName));
	}
	
}
