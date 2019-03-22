package com.glaucus.java.assignment.dao;

import java.util.List;

import com.glaucus.java.assignment.model.Product;

public interface ProductDAO {

	public Product addProduct(Product newProduct);
	
	public List<Product> getAllProducts();
}
