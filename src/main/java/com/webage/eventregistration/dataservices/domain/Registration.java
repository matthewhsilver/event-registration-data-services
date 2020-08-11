package com.webage.eventregistration.dataservices.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="REGISTRATIONS")
public class Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonProperty("event_id")
	private Long eventId;
	
	@JsonProperty("customer_id")
	private Long customerId;

	@JsonProperty("registration_date")
	private Date registrationDate;
	
	private String notes;

	public Registration() {
	}

	public Registration(Long id, Long eventId, Long customerId, Date registrationDate, String notes) {
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

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
