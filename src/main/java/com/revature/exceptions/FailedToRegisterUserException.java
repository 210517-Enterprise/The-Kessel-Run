package com.revature.exceptions;

public class FailedToRegisterUserException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5788625983690434493L;

	public FailedToRegisterUserException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FailedToRegisterUserException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public FailedToRegisterUserException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public FailedToRegisterUserException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public FailedToRegisterUserException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
