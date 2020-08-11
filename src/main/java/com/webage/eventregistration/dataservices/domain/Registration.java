package com.webage.eventregistration.dataservices.domain;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Registration {

	private Long id;
	@JsonProperty("event_id")
	private Long eventId;
	@JsonProperty("customer_id")
	private Long customerId;
	@JsonProperty("registration_date")
	private LocalDate registrationDate;
	private String notes;

	public Registration() {
	}

	public Registration(Long id, Long eventId, Long customerId, LocalDate registrationDate, String notes) {
		super();
		this.id = id;
		this.eventId = eventId;
		this.customerId = customerId;
		this.registrationDate = registrationDate;
		this.notes = notes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
