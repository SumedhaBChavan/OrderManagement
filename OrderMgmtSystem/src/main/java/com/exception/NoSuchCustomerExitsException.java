package com.exception;

public class NoSuchCustomerExitsException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private String message;
	public NoSuchCustomerExitsException()
	{}
	public NoSuchCustomerExitsException(String msg)
	{
		super(msg);
		this.message = msg;
	}

}
