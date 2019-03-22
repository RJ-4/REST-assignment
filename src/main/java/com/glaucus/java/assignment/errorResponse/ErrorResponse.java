package com.glaucus.java.assignment.errorResponse;

public class ErrorResponse {

	private int statusCode;
	
	private String errorMessage;
	
	private long timestamp;

	public ErrorResponse(int statusCode, String errorMessage, long timestamp) {
		super();
		this.statusCode = statusCode;
		this.errorMessage = errorMessage;
		this.timestamp = timestamp;
	}

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
