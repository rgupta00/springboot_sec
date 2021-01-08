package com.bookapp.model.controller;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.bookapp.model.service.exceptions.BookNotFoundException;
import com.bookapp.model.service.exceptions.ErrorMessage;

@RestController
@ControllerAdvice // aop.. so
public class ExceptionHandlerController extends ResponseEntityExceptionHandler{

	// this method now onward will called if validation 303 have failed...
	@Override
	public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setMessage(ex.getBindingResult().toString());
		errorMessage.setDetails("bean validation failed, refer documentation of api");
		errorMessage.setTimeStamp(new Date());
		errorMessage.setContact("rgupta.mtech@gmail.com");
		
		return new ResponseEntity<Object>(errorMessage, HttpStatus.BAD_REQUEST);
		
	}

	@ExceptionHandler(value = BookNotFoundException.class)
	public ResponseEntity<ErrorMessage>
	handleBookNotFoundException(BookNotFoundException ex, WebRequest req) {
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setMessage(ex.getMessage());
		errorMessage.setDetails(req.getDescription(false));
		errorMessage.setTimeStamp(new Date());
		errorMessage.setContact("rgupta.mtech@gmail.com");
		return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorMessage>
	handleAnyException(Exception ex, WebRequest req) {
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setMessage(ex.getMessage());
		errorMessage.setDetails(req.getDescription(false));
		errorMessage.setTimeStamp(new Date());
		errorMessage.setContact("rgupta.mtech@gmail.com");
		return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}









