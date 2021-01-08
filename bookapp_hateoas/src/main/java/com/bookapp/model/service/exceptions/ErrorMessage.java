package com.bookapp.model.service.exceptions;

import java.util.Date;

public class ErrorMessage {
	private String message;
	private String contact;
	private String details;
	private Date timeStamp;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public ErrorMessage(String message, String contact, String details, Date timeStamp) {
		this.message = message;
		this.contact = contact;
		this.details = details;
		this.timeStamp = timeStamp;
	}
	public ErrorMessage() {}
	
	
	
}
