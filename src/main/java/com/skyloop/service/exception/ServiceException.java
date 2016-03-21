package com.skyloop.service.exception;

public class ServiceException extends Exception{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String id;
private String message;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}

}
