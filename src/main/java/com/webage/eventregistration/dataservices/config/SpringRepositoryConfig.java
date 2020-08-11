package com.webage.eventregistration.dataservices.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.webage.eventregistration.dataservices.repository.EventRepository;
import com.webage.eventregistration.dataservices.repository.InMemoryEventRepository;
import com.webage.eventregistration.dataservices.repository.InMemoryRegistrationRepository;
import com.webage.eventregistration.dataservices.repository.RegistrationRepository;

@Configuration
public class SpringRepositoryConfig {

	@Bean
	public EventRepository eventRepository() {
		return new InMemoryEventRepository();
	}
	
	@Bean
	public RegistrationRepository registrationRepository() {
		return new InMemoryRegistrationRepository();
	}
}
