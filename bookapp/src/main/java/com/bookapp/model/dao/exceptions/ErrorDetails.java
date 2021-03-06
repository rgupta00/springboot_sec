package com.bookapp.model.dao.exceptions;

import java.util.Date;

public class ErrorDetails {
	private String message;
	private String errorMessage;
	private String contact;
	private Date timeStamp;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ErrorDetails() {}
	public ErrorDetails(String message, String errorMessage, String contact, Date timeStamp) {
		super();
		this.message = message;
		this.errorMessage = errorMessage;
		this.contact = contact;
		this.timeStamp = timeStamp;
	}
	
	
}
