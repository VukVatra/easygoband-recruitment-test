package com.w4c.example.exception;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "stackTrace", "localizedMessage" })
public class CustomException extends Exception {

	private String code;

	private String readableMessage;

	public CustomException() {
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -742227460526368486L;

	public CustomException(String code, String readableMessage, Throwable cause) {
		super(cause.getMessage(), cause);
		this.code = code;
		this.readableMessage = readableMessage;
	}

	public CustomException(String code, String readableMessage) {
		super(readableMessage);
		this.code = code;
		this.readableMessage = readableMessage;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getReadableMessage() {
		return readableMessage;
	}

	public void setReadableMessage(String readableMessage) {
		this.readableMessage = readableMessage;
	}

}
