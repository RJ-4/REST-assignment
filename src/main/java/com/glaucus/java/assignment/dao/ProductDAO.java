package com.glaucus.java.assignment.dao;

import java.util.List;

import com.glaucus.java.assignment.model.Product;

public interface ProductDAO {

	public Product addProduct(Product newProduct);
	
	public List<Product> getAllProducts();
	
	public Product getProductById(int productId);
	
	public long getTotalNumberOfProducts();
	
	public Product updateProduct(int productId, Product updatedProduct);
}
