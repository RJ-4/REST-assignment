package com.glaucus.java.assignment.constants;

public class Constants {

	public static final String GET_ALL_PRODUCTS_QUERY = "FROM Product";
	
	public static final String GET_TOTAL_NUMBER_OF_PRODUCTS_QUERY = "SELECT COUNT(id) FROM Product";
	
	public static final String PRODUCT_NOT_FOUND_ERROR_MESSAGE = "Product not found!!!";
	
	public static final String NO_PRODUCTS_FOUND_EXCEPTION = "No products found!!!";
	
	public static final String PRODUCT_NAME_CANNOT_BE_EMPTY_MESSAGE = "Product name cannot be empty!!!";
	
	public static final String PRODUCT_STOCK_CANNOT_BE_EMPTY_MESSAGE = "Product stock cannot be empty!!!";
	
	public static final String PRODUCT_UNIT_PRICE_CANNOT_BE_EMPTY_MESSAGE = "Product unit price cannot be empty!!!";
	
	public static final String NEGATIVE_STOCK_EXCEPTION_MESSAGE = "Product stock cannot be negative!!!";
	
	public static final String UNIT_PRICE_EXCEPTION_MESSAGE = "Product unit price must be positive!!!";
	
}
