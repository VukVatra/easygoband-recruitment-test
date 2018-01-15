package com.w4c.example.exception;

public enum ErrorCodes {

	BAD_REQUEST("BR_001"), UNAUTHORIZED("UE_001"), NOT_FOUND("NE_001"), INTERNAL_SERVER_ERROR(
			"SE_001"), BUSINESS_LOGIC_ERROR("BE_001");

	private final String name;

	private ErrorCodes(String s) {
		name = s;
	}

	public boolean equalsName(String otherName) {
		return (otherName == null) ? false : name.equals(otherName);
	}

	public String toString() {
		return this.name;
	}

}
