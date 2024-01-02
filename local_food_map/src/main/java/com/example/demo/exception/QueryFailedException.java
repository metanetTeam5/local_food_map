package com.example.demo.exception;

public class QueryFailedException  extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public QueryFailedException(String message) {
		super(message);
	}

}
