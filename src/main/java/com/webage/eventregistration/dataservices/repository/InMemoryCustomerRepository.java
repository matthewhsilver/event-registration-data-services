package com.webage.eventregistration.dataservices.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.webage.eventregistration.dataservices.domain.Customer;

public class InMemoryCustomerRepository implements CustomerRepository {

	private static List<Customer> customerData = new ArrayList<>(Arrays.asList(
				new Customer(1L, "jsmith", "jsmith@gmail.com", "jsmith"),
				new Customer(2L, "lhamilton", "lhamilton@gmail.com", "lhamilton"),
				new Customer(3L, "bjones", "bjones@gmail.com", "bjones")
			));
	
	@Override
	public Collection<Customer> findAll() {
		return Collections.unmodifiableCollection(customerData);
	}

	@Override
	public Optional<Customer> findById(Long id) {
		return customerData.stream().filter(c -> id.equals(c.getId())).findFirst();
	}

	@Override
	public Optional<Customer> findByName(String name) {
		return customerData.stream().filter(c -> name.equals(c.getName())).findFirst();
	}

	
}
