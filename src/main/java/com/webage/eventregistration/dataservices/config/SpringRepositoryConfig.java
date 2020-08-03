package com.webage.eventregistration.dataservices.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.webage.eventregistration.dataservices.repository.CustomerRepository;
import com.webage.eventregistration.dataservices.repository.EventRepository;
import com.webage.eventregistration.dataservices.repository.InMemoryCustomerRepository;
import com.webage.eventregistration.dataservices.repository.InMemoryEventRepository;

@Configuration
public class SpringRepositoryConfig {

	@Bean
	public CustomerRepository customerRepository() {
		return new InMemoryCustomerRepository();
	}
	
	@Bean
	public EventRepository eventRepository() {
		return new InMemoryEventRepository();
	}
}
