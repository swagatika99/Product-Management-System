package com.capgemini.drinkanddelight.exception;

import java.util.Date;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomError extends ResponseEntityExceptionHandler{
	
	Date date;
	//private long currentTimeMillis = System.currentTimeMillis();
	private String errorMsg = "Some thing went wrong!";
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorMessage> somethingWentWrong(Exception ex){
		
		ErrorMessage exceptionResponse =
				new ErrorMessage(ex.getMessage(), 
						errorMsg,new Date());
		return new ResponseEntity<ErrorMessage>(exceptionResponse,
				new HttpHeaders(),HttpStatus.BAD_REQUEST);
		
	}
	
	
	
	/*
	 * @ExceptionHandler(NullParameterException.class) public final
	 * ResponseEntity<ErrorMessage> nullParameter(NullParameterException ex){
	 * 
	 * ErrorMessage exceptionResponse = new ErrorMessage(ex.getMessage(),
	 * errorMsg,currentTimeMillis); return new
	 * ResponseEntity<ErrorMessage>(exceptionResponse, new
	 * HttpHeaders(),HttpStatus.NOT_FOUND); }
	 */
	 
	//handle http request if method not found (if we use patch instead of post)
	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(
			HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

		ErrorMessage exceptionResponse =
				new ErrorMessage(ex.getMessage(), 
						"Method not allowed" ,new Date());
		
		return new ResponseEntity<>(exceptionResponse,
				new HttpHeaders(),HttpStatus.METHOD_NOT_ALLOWED);
	}
	
	
	//if variables are null in a class method argument not valid exception
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

		ErrorMessage exceptionResponse =
				new ErrorMessage(ex.getMessage(), 
						"MethodArgumentNotValidException" ,new Date());
		
		return new ResponseEntity<>(exceptionResponse,
				new HttpHeaders(),HttpStatus.BAD_REQUEST);
	}
	
	
	//Product order not found exception
	@ExceptionHandler(ProductOrderNotFoundException.class)
	public final ResponseEntity<Object> handleProductNotFoundException(
			ProductOrderNotFoundException ex, WebRequest request) 
	{
	
		ErrorMessage exceptionResponse =
				new ErrorMessage(ex.getMessage(), 
						request.getDescription(false),new Date());
		
		return new ResponseEntity<>(exceptionResponse,HttpStatus.NOT_FOUND);
	
	}
	
	
	}


class ErrorMessage{
	private String message;
	private String details;
	private Date timestamp;
	
	public ErrorMessage() {}
	
	
	
	public ErrorMessage(String message, String details, Date date) {
		super();
		this.message = message;
		this.details = details;
		this.timestamp = date;
	}



	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getDetails() {
		return details;
	}
	
	public void setDetails(String details) {
		this.details = details;
	}



	public Date getTimestamp() {
		return timestamp;
	}



	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	
}