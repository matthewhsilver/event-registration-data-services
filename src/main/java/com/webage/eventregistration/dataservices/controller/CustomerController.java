package com.webage.eventregistration.dataservices.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.webage.eventregistration.dataservices.domain.Customer;
import com.webage.eventregistration.dataservices.service.CustomerService;
import com.webage.eventregistration.dataservices.util.Utils;

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
	
	@GetMapping("/name/{name}")
	public ResponseEntity<Customer> findCustomerByName(@PathVariable("name") String name) {
		return ResponseEntity.of(customerService.findByName(name));
	}
	
	@PostMapping
	public ResponseEntity<?> addCustomer(@RequestBody Customer customer) {
		if (!customer.getId().equals(0L) ||
				Utils.isEmpty(customer.getName()) ||
				Utils.isEmpty(customer.getEmail())) {
			return ResponseEntity.badRequest().build();
		}
		
		Customer newCustomer = customerService.saveCustomer(customer);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(newCustomer.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateCustomer(@PathVariable("id") Long id, @RequestBody Customer customer) {
		if (!customer.getId().equals(id) ||
				Utils.isEmpty(customer.getName()) ||
				Utils.isEmpty(customer.getEmail())) {
			return ResponseEntity.badRequest().build();
		}
		
		customerService.saveCustomer(customer);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/{id}") 
	public ResponseEntity<?> deleteCustomer(@PathVariable("id") Long id) {
		if (id.equals(0L)) {
			return ResponseEntity.badRequest().build();
		}
		
		ResponseEntity<?> response;
		
		try {
			customerService.deleteCustomer(id);
			response = ResponseEntity.noContent().build();
		} catch (Exception e) {
			e.printStackTrace();
			response = new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return response;
	}
	
}
