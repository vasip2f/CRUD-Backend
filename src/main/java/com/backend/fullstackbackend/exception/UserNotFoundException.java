package com.backend.fullstackbackend.exception;

public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(long id) {
		// TODO Auto-generated constructor stub
		
		super("could not found the id" +id);
	}
	
	

}
