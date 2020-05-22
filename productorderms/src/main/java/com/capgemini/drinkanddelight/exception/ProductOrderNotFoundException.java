package com.capgemini.drinkanddelight.exception;

public class ProductOrderNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  ProductOrderNotFoundException(String msg)
	{
	super(msg);
}

}
