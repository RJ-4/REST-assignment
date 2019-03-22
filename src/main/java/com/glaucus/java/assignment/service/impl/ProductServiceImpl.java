package com.glaucus.java.assignment.service.impl;

import static com.glaucus.java.assignment.constants.Constants.NO_PRODUCTS_FOUND_EXCEPTION;
import static com.glaucus.java.assignment.constants.Constants.PRODUCT_NOT_FOUND_ERROR_MESSAGE;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glaucus.java.assignment.dao.ProductDAO;
import com.glaucus.java.assignment.exception.ProductNotFoundException;
import com.glaucus.java.assignment.model.Product;
import com.glaucus.java.assignment.service.ProductService;
import com.glaucus.java.assignment.validation.ProductValidation;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;
	
	@Override
	@Transactional
	public Product addProduct(Product newProduct) {

		ProductValidation newValidation = new ProductValidation();
		newValidation.addOrUpdateProductValidation(newProduct);
		newValidation.checkStock(newProduct.getStock());
		newValidation.checkUnitPrice(newProduct.getUnitPrice());
		return productDAO.addProduct(newProduct);
	}

	@Override
	@Transactional
	public List<Product> getAllProducts() {
		
		List<Product> fetchedProducts = productDAO.getAllProducts();
		if(fetchedProducts.size() == 0) {
			throw new ProductNotFoundException(NO_PRODUCTS_FOUND_EXCEPTION);
		}
		return fetchedProducts;
	}

	@Override
	@Transactional
	public Product getProductById(int productId) {
		
		Product fetchedProduct = productDAO.getProductById(productId);
		if(fetchedProduct == null) {
			throw new ProductNotFoundException(PRODUCT_NOT_FOUND_ERROR_MESSAGE);
		}
		return fetchedProduct;
	}

	@Override
	@Transactional
	public long getTotalNumberOfProducts() {

		return productDAO.getTotalNumberOfProducts();
	}

	@Override
	@Transactional
	public Product updateProduct(int productId, Product updatedProduct) {
		
		ProductValidation newValidation = new ProductValidation();
		
		if(updatedProduct.getStock() != null) {
			newValidation.checkStock(updatedProduct.getStock());
		}
		if(updatedProduct.getUnitPrice() != null) {
			newValidation.checkUnitPrice(updatedProduct.getUnitPrice());
		}		
		return productDAO.updateProduct(productId, updatedProduct);
	}

	@Override
	@Transactional
	public boolean removeProduct(int productId) {

		return productDAO.removeProduct(productId);
	}

}
