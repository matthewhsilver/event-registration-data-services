package com.webage.eventregistration.dataservices.domain;

import java.util.Date;

public class Registration {

	private Long id;
	private String eventId;
	private String customerId;
	private Date registrationDate;
	private String notes;

	public Registration() {
	}

	public Registration(Long id, String eventId, String customerId, Date registrationDate, String notes) {
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

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
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
