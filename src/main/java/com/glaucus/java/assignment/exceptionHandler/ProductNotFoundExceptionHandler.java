package com.glaucus.java.assignment.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.glaucus.java.assignment.errorResponse.ErrorResponse;
import com.glaucus.java.assignment.exception.ProductNotFoundException;

@ControllerAdvice
public class ProductNotFoundExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<ErrorResponse> handleProductNotFoundException(ProductNotFoundException e) {
		
		ErrorResponse errorResponse = new ErrorResponse();
		
		errorResponse.setStatusCode(HttpStatus.NOT_FOUND.value());
		
		errorResponse.setErrorMessage(e.getMessage());
		
		errorResponse.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorResponse> handleBadRequestException(Exception e) {
		
		ErrorResponse errorResponse = new ErrorResponse();
		
		errorResponse.setStatusCode(HttpStatus.BAD_REQUEST.value());
		
		errorResponse.setErrorMessage(e.getMessage());
		
		errorResponse.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST); 
	}
}
