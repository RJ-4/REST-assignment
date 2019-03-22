package com.glaucus.java.assignment.service;

import java.util.List;

import com.glaucus.java.assignment.model.Product;

public interface ProductService {

	public Product addProduct(Product newProduct);
	
	public List<Product> getAllProducts();
}
