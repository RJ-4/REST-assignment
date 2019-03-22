package com.glaucus.java.assignment.validation;

import static com.glaucus.java.assignment.constants.Constants.*;

import com.glaucus.java.assignment.exception.NegativeStockException;
import com.glaucus.java.assignment.exception.NegativeUnitPriceException;
import com.glaucus.java.assignment.model.Product;

/**
 * Validation class for product which contains validations for when product is being saved/updated into the database.
 * It specifies validations for product name, description, stock and unit price.
 * 
 * @author Rishabh Jain
 *
 */
public class ProductValidation {

	/**
	 * Used to perform validations and throw exceptions when the product being added/updated contains invalid values like null and whitespace.
	 * 
	 * @param newProduct Product object containing data to be added/updated into the database
	 */
	public void addOrUpdateProductValidation(Product newProduct) {
		
		newProduct.setName(newProduct.getName().trim());
		newProduct.setDescription(newProduct.getDescription().trim());
		
		if(newProduct.getName() == null || newProduct.getName().trim().equals("")) {
			throw new RuntimeException(PRODUCT_NAME_CANNOT_BE_EMPTY_MESSAGE);
		}
		
		if(newProduct.getStock() == null) {
			throw new RuntimeException(PRODUCT_STOCK_CANNOT_BE_EMPTY_MESSAGE);
		}
		
		if(newProduct.getUnitPrice() == null) {
			throw new RuntimeException(PRODUCT_UNIT_PRICE_CANNOT_BE_EMPTY_MESSAGE);
		}
	}
	
	/**
	 * Throws NegativeStockException if the stock of the product entered is less than 0.
	 * 
	 * @param stock Stock of the product
	 */
	public void checkStock(int stock) {
		if(stock < 0) {
			throw new NegativeStockException(NEGATIVE_STOCK_EXCEPTION_MESSAGE);
		}
	}
	
	
	/**
	 * Throws NegativeUnitPriceException if the unit price of a product is specified as less than or equal to 0.
	 * 
	 * @param unitPrice Unit price of the product
	 */
	public void checkUnitPrice(double unitPrice) {
		if(unitPrice <= 0) {
			throw new NegativeUnitPriceException(UNIT_PRICE_EXCEPTION_MESSAGE);
		}
	}
	
}
