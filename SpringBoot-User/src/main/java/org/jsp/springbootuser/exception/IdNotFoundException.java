package org.jsp.springbootuser.exception;

public class IdNotFoundException extends RuntimeException{
	
	@Override
	public String getMessage() {
		return "Invalid ID";
	}
}
