package com.exception;



import java.time.LocalDate;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
		
		// Fill the code here
		ExceptionResponse e=new ExceptionResponse(LocalDate.now(), ex.getMessage(), request.getDescription(false), "INTERNAL_SERVER_ERROR");
		return new ResponseEntity<>(e,HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	}
	@ExceptionHandler({InvalidArticleException.class,InvalidReplyException.class})
	public final ResponseEntity<ExceptionResponse> handleNotFoundException(RuntimeException ex, WebRequest request) {
		
		// Fill the code here
		ExceptionResponse e= new ExceptionResponse(LocalDate.now(), ex.getMessage(), request.getDescription(false), "NOT_FOUND");	
		return new ResponseEntity<>(e,HttpStatus.NOT_FOUND);
		
		
		
//		return null;	
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
		HttpHeaders headers, HttpStatusCode status, WebRequest request) {	
		    
		// Fill the code here
		ExceptionResponse e=new ExceptionResponse(LocalDate.now(), ex.getMessage(), request.getDescription(false), "BAD_REQUEST");
		return new ResponseEntity<>(e,HttpStatus.BAD_REQUEST);
		
		    
//		return null;
	}
}