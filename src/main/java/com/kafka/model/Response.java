package com.kafka.model;

import org.springframework.http.HttpStatus;

public class Response<T> {

	private T data;
	private HttpStatus statusCode;
	private String message;

	public Response() {
		super();
	}

	public Response(T data, HttpStatus statusCode, String message) {
		super();
		this.data = data;
		this.statusCode = statusCode;
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public HttpStatus getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}




}
