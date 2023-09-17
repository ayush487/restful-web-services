package com.in28minutes.rest.webservices.restfulwebservices.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
	
	private LocalDateTime timeStamp;
	private String message;
	private String details;
	
	public ErrorDetails(LocalDateTime timeStamp, String message, String details) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.details = details;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public String getDetails() {
		return details;
	}
}
