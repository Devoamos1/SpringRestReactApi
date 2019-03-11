package com.wiredbrain.friends.util;

//Json Message in the form of a Java class
public class ErrorMessage {

	private String status;
	public ErrorMessage(String status, String message) {
		this.status = status;
		this.message = message;
	}
	private String message;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	} 
}
