package com.glaucus.java.assignment.validation;

import static com.glaucus.java.assignment.constants.Constants.*;

import com.glaucus.java.assignment.exception.NegativeStockException;
import com.glaucus.java.assignment.exception.NegativeUnitPriceException;
import com.glaucus.java.assignment.model.Product;

public class ProductValidation {

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
	
	public void checkStock(int stock) {
		if(stock < 0) {
			throw new NegativeStockException(NEGATIVE_STOCK_EXCEPTION_MESSAGE);
		}
	}
	
	public void checkUnitPrice(double unitPrice) {
		if(unitPrice <= 0) {
			throw new NegativeUnitPriceException(UNIT_PRICE_EXCEPTION_MESSAGE);
		}
	}
	
}
