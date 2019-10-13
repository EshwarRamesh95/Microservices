package com.employee.exceptions;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class EmployeeExceptionHandler extends ResponseEntityExceptionHandler {

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponse> handleAllException(Exception ex) {
		ExceptionResponse exception = new ExceptionResponse(ex.getLocalizedMessage(),
				sdf.format(new Date()));
		return new ResponseEntity<>(exception, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public final ResponseEntity<ExceptionResponse> handleEmployeeNotFoundException(EmployeeNotFoundException ex) {
		ExceptionResponse exception = new ExceptionResponse(ex.getLocalizedMessage(),
				sdf.format(new Date()));
		return new ResponseEntity<>(exception, HttpStatus.NOT_FOUND);
	}

}
