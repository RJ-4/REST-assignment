package com.glaucus.java.assignment.exception;

/**
 * Declares an exception for unit price of the product if it is less than or equal to 0.
 * 
 * @author Rishabh Jain
 *
 */
public class NegativeUnitPriceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeUnitPriceException() {
		// TODO Auto-generated constructor stub
	}

	public NegativeUnitPriceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NegativeUnitPriceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public NegativeUnitPriceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NegativeUnitPriceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
