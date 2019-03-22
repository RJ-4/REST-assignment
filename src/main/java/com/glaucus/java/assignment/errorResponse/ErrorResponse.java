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

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "ErrorResponse [statusCode=" + statusCode + ", errorMessage=" + errorMessage + ", timestamp=" + timestamp
				+ "]";
	}
	
}
