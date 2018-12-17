package com.wendelanchieta.cursomc.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

	private static final long serialVersionUID = 1L;
	
	List<FieldMessage> errors = new ArrayList<>();

	public ValidationError() {
		
	}
	
	public ValidationError(Long timestamp, Integer status, String error, String message, String path) {
		super(timestamp, status, error, message, path);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void setList(List<FieldMessage> list) {
		this.errors = list;
	}
	
	public void addError(String fieldNeme, String message) {
		errors.add(new FieldMessage(fieldNeme, message));
	}
}
