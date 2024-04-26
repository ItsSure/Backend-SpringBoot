package com.hotel.trivoli.util;

import lombok.Data;

@Data
public class ResponseMessage<T> {

	public ResponseMessage() {
		// Default constructor
	}

	public ResponseMessage(int code, String message, T data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	private int code;
	private String message;
	private T data;

}
