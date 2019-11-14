package com.auto.components.exception;

import com.auto.util.StatusCode;

/**
 * 系统自定义异常类，针对预期异常，需要在程序中抛出此类异常
 * 
 * @author DDM
 *
 */
@SuppressWarnings("serial")
public class CustomException extends Exception {
	private StatusCode statusCode;
	private String message;

	public CustomException(StatusCode statusCode, String message) {
		this.message = message;
		this.statusCode = statusCode;
	}

	public CustomException(String message) {
		this.message = message;
		this.statusCode = StatusCode.ERROR;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public StatusCode getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(StatusCode statusCode) {
		this.statusCode = statusCode;
	}

}
