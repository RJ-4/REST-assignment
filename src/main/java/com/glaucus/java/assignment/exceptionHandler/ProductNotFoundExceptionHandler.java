package com.glaucus.java.assignment.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.glaucus.java.assignment.errorResponse.ErrorResponse;
import com.glaucus.java.assignment.exception.ProductNotFoundException;

/**
 * Contains global exception handlers that intercepts/handles all exceptions that are occurred during the client-server communication.
 *  
 * @author Rishabh Jain
 *
 */
@ControllerAdvice
public class ProductNotFoundExceptionHandler {

	/**
	 * Exception handler for ProductNotFoundException. Handles exception if the product is not found in the database.
	 * 
	 * @param e Reference for ProductNotFoundException
	 * 
	 * @return Response Entity of ErrorResponse type.
	 */
	@ExceptionHandler
	public ResponseEntity<ErrorResponse> handleProductNotFoundException(ProductNotFoundException e) {
		
		ErrorResponse errorResponse = new ErrorResponse();
		
		errorResponse.setStatusCode(HttpStatus.NOT_FOUND.value());
		
		errorResponse.setErrorMessage(e.getMessage());
		
		errorResponse.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
	}
	
	/**
	 * Exception handler for all exceptions except for the ProductNotFoundException.
	 * 
	 * @param e Reference for Exception
	 * 
	 * @return Response Entity of ErrorResponse type.
	 */
	@ExceptionHandler
	public ResponseEntity<ErrorResponse> handleBadRequestException(Exception e) {
		
		ErrorResponse errorResponse = new ErrorResponse();
		
		errorResponse.setStatusCode(HttpStatus.BAD_REQUEST.value());
		
		errorResponse.setErrorMessage(e.getMessage());
		
		errorResponse.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST); 
	}
}
