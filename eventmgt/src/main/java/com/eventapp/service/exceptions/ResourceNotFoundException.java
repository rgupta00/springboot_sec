package com.eventapp.service.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 5070385063171955184L;

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
