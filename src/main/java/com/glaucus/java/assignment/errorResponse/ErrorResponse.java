package com.glaucus.java.assignment.errorResponse;

/**
 * Describes the type and structure of response that will be sent to the client in case of an error/exception.
 * 
 * @author Rishabh Jain
 *
 */
public class ErrorResponse {

	private int statusCode;
	
	private String errorMessage;
	
	private long timestamp;

	/**
	 * Creates a new ErrorResponse object
	 * 
	 * @param statusCode HTTP status error code
	 * @param errorMessage Message due to which error occured
	 * @param timestamp Timestamp of the error
	 */
	public ErrorResponse(int statusCode, String errorMessage, long timestamp) {
		super();
		this.statusCode = statusCode;
		this.errorMessage = errorMessage;
		this.timestamp = timestamp;
	}

	/**
	 * Creates a new ErrorResponse object
	 */
	public ErrorResponse() {}

	
	/**
	 * Returns the Http status code of the error response message.
	 * 
	 * @return Integer value denoting http status
	 */
	public int getStatusCode() {
		return statusCode;
	}

	
	/**
	 * Sets the Http status code of the error response message.
	 * 
	 * @param statusCode Http status code of the error response message
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	
	/**
	 * Returns the message of the error.
	 * 
	 * @return String value denoting message of the http error
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	
	/**
	 * Sets the message of the error.
	 * 
	 * @param errorMessage Error message of the http request
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	
	/**
	 * Returns the timestamp of the http error response in millis.
	 * 
	 * @return Long value denoting the timestamp of the error message in millis
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the timestamp of the http error response.
	 * 
	 * @param timestamp Timestamp of the error response
	 */
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "ErrorResponse [statusCode=" + statusCode + ", errorMessage=" + errorMessage + ", timestamp=" + timestamp
				+ "]";
	}
	
}
