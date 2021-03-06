package com.bookapp.model.dao.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value =HttpStatus.NOT_FOUND)
public class BookNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -4465236137021151482L;

	public BookNotFoundException(String message) {
		super(message);
	}
	
}
