package com.glaucus.java.assignment.validation;

import static com.glaucus.java.assignment.constants.Constants.*;
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
	
}
