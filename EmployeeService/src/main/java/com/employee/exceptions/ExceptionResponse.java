package com.employee.exceptions;

public class ExceptionResponse {

	private String message;

	private String dateTime;

	public ExceptionResponse() {

	}

	public ExceptionResponse(String message, String dateTime) {
		super();
		this.message = message;
		this.dateTime = dateTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

}
