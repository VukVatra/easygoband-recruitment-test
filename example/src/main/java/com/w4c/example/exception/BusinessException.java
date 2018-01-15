package com.w4c.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class BusinessException extends CustomException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8246737460006758649L;

	public BusinessException() {
		super();
	}

	public BusinessException(String code, String readableMessage, Throwable cause) {
		super(code, readableMessage, cause);
	}

	public BusinessException(String code, String readableMessage) {
		super(code, readableMessage);
	}

}
