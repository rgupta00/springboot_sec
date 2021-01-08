package com.bookapp.model.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.bookapp.model.dao.exceptions.BookNotFoundException;
import com.bookapp.model.dao.exceptions.ErrorDetails;

@RestController
@ControllerAdvice
public class ExceptionHandlerController {

	//whenever u want to return status code + data ==> ResponseEntity
	
	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleBookNotFoundException(BookNotFoundException ex, 
			WebRequest request) {
		ErrorDetails details=new ErrorDetails();
		details.setErrorMessage(request.getDescription(false));//false?
		details.setContact("rgutpa.mtech@gmail.com");
		details.setTimeStamp(new Date());
		details.setMessage(ex.getMessage());
		
		return  new ResponseEntity<ErrorDetails>(details, HttpStatus.NOT_FOUND);
		
	}
	

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> serverSideExceptionHandler(Exception ex, 
			WebRequest request) {
		ErrorDetails details=new ErrorDetails();
		details.setErrorMessage("some server side problem, try after some time");//false?
		details.setContact("rgutpa.mtech@gmail.com");
		details.setTimeStamp(new Date());
		details.setMessage(ex.getMessage());
		
		return  new ResponseEntity<ErrorDetails>(details, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}




