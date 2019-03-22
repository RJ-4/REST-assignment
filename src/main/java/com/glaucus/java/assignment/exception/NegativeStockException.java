package com.glaucus.java.assignment.exception;

/**
 * Declares an exception for negative values of stock of product.
 * 
 * @author Rishabh Jain
 *
 */
public class NegativeStockException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeStockException() {
		// TODO Auto-generated constructor stub
	}

	public NegativeStockException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NegativeStockException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public NegativeStockException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NegativeStockException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
