package com.glaucus.java.assignment.service;

import java.util.List;

import com.glaucus.java.assignment.model.Product;

public interface ProductService {

	public Product addProduct(Product newProduct);
	
	public List<Product> getAllProducts();
	
	public Product getProductById(int productId);
	
	public long getTotalNumberOfProducts();
	
	public Product updateProduct(int productId, Product updatedProduct);
	
	public boolean removeProduct(int productId);

}
