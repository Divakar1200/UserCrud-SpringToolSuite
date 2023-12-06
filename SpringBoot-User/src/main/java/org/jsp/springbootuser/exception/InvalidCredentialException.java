package org.jsp.springbootuser.exception;

public class InvalidCredentialException extends RuntimeException{
	@Override
	public String getMessage() {
		return "Invalid Id / Phone / email or password";
	}
}
