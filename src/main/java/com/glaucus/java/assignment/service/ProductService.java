package com.glaucus.java.assignment.service;

import java.util.List;

import com.glaucus.java.assignment.model.Product;

/**
 * Service interface used to communicate between the REST product controller and the DAO layer and provide business logic if required.
 * 
 * @author Rishabh Jain
 *
 */
public interface ProductService {

	/**
	 * Receives the data from product controller and checks for validations for product name, product stock etc. and then transfers the control over
	 * to DAO layer to connect with the database. After the product is saved and the saved product is returned from the ProductDAO, it sends the data
	 * back to ProductController.
	 *  
	 * @param newProduct New Product
	 * 
	 * @return Saved product
	 */
	public Product addProduct(Product newProduct);
	
	
	/**
	 * Receives the control from product controller and checks for validations for product name, product stock etc. and then transfers the control over
	 * to DAO layer to connect with the database. After all the products are fetched and returned from the ProductDAO, it sends the data
	 * back to ProductController.
	 * 
	 * @return List of all Products in the database.
	 */
	public List<Product> getAllProducts();
	
	
	/**
	 * Receives the product id of the product to be fetched and transfers control to the ProductDAO. When the result is return from the DAO layer,
	 * it checks if the returned value is null. If it is null, then ProductNotFoundException is thrown, else it sends the fetched product to the 
	 * controller. 
	 * 
	 * @param productId Product id of the product to fetched
	 * 
	 * @return Fetched product
	 */
	public Product getProductById(int productId);
	
	
	/**
	 * Transfers the request to fetch total number of products in the database to ProductDAO and returns the fetched value to the 
	 * ProductController.
	 * 
	 * @return Long value denoting total number of products in the database
	 */
	public long getTotalNumberOfProducts();
	
	
	/**
	 * Receives the data from product controller and checks for validations for product name, product stock etc. and then transfers the control over
	 * to DAO layer to connect with the database. After the product is updated and the updated product is returned from the ProductDAO, 
	 * it sends the data back to ProductController.
	 * 
	 * @param productId Product id of the product that is to be updated
	 * 
	 * @param updatedProduct Product containing the updated details of the specified product
	 *  
	 * @return Updated product
	 */
	public Product updateProduct(int productId, Product updatedProduct);
	
	
	/**
	 * Receives the data from product controller then transfers the control over
	 * to DAO layer to connect with the database to delete the product with the specified product id. If the product is deleted, it returns true,
	 * else it returns false.
	 *  
	 * @param productId Product id of the product to be deleted
	 * 
	 * @return boolean value which returns true if the product is deleted or false if the product is not deleted.
	 */
	public boolean removeProduct(int productId);

}
