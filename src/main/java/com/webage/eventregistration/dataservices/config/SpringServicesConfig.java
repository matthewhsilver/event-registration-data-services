package com.webage.eventregistration.dataservices.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.webage.eventregistration.dataservices.repository.CustomerRepository;
import com.webage.eventregistration.dataservices.repository.EventRepository;
import com.webage.eventregistration.dataservices.repository.RegistrationRepository;
import com.webage.eventregistration.dataservices.service.CustomerService;
import com.webage.eventregistration.dataservices.service.CustomerServiceImpl;
import com.webage.eventregistration.dataservices.service.EventService;
import com.webage.eventregistration.dataservices.service.EventServiceImpl;
import com.webage.eventregistration.dataservices.service.RegistrationService;
import com.webage.eventregistration.dataservices.service.RegistrationServiceImpl;

@Configuration
public class SpringServicesConfig {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private EventRepository eventRepository;
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	@Bean
	public CustomerService customerService() {
		return new CustomerServiceImpl(customerRepository);
	}
	
	@Bean
	public EventService eventService() {
		return new EventServiceImpl(eventRepository);
	}
	
	@Bean
	public RegistrationService registrationService() {
		return new RegistrationServiceImpl(registrationRepository);
	}
}
