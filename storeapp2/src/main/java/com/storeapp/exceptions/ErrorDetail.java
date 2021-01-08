package com.storeapp.exceptions;

import java.time.LocalDateTime;

public class ErrorDetail {
	private String errorMessage;
	private String contact;
	private String message;
	private LocalDateTime timeStamp;
	
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public ErrorDetail(String errorMessage, String contact, String message, LocalDateTime timeStamp) {
		this.errorMessage = errorMessage;
		this.contact = contact;
		this.message = message;
		this.timeStamp = timeStamp;
	}
	public ErrorDetail() {}
	
	
}
