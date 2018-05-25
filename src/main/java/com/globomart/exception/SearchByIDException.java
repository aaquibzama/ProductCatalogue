package com.globomart.exception;

public class SearchByIDException extends Exception{

	String exceptionCode;
	String exceptionMessage;
	
	
	public SearchByIDException(String exceptionCode, String exceptionMessage) {
		this.exceptionCode = exceptionCode;
		this.exceptionMessage = exceptionMessage;
	}
	
	@Override
	public void printStackTrace() {
		System.out.println("Error: " + exceptionCode + " Message: " + exceptionMessage);
		super.printStackTrace();
	}
}
