package com.glaucus.java.assignment.dao;

import java.util.List;

import com.glaucus.java.assignment.model.Product;
/**
 * ProductDAO interface is used to declare the CRUD operations that can be performed on the database.
 * 
 * @author Rishabh Jain
 *
 */
public interface ProductDAO {

	/**
	 * Adds a new product to the database.
	 * 
	 * @param newProduct Details of the product to be added
	 * 
	 * @return Saved product
	 */
	public Product addProduct(Product newProduct);
	
	
	/**
	 * Retrieves all the products from the database.
	 * 
	 * @return List of all the retrieved Products.
	 */
	public List<Product> getAllProducts();
	
	
	/**
	 * Retrieves the product with the specified product Id
	 * 
	 * @param productId Product Id for which the product will be fetched
	 * 
	 * @return Retrieved product corresponding to the product Id.
	 */
	public Product getProductById(int productId);
	
	
	/**
	 * Retrieves the total number of products in database.
	 * 
	 * @return Long value denoting the number of products present in the database.
	 */
	public long getTotalNumberOfProducts();
	
	
	/**
	 * Updates the product based on the product Id and the corresponding updated information sent by the client.
	 * 
	 * @param productId Product Id of the product to be updated
	 * @param updatedProduct Product type containing updated properties/fields of the product
	 * 
	 * @return Updated product
	 */
	public Product updateProduct(int productId, Product updatedProduct);
	
	
	/**
	 * Deletes the product based on the product Id from the database.
	 * 
	 * @param productId Product id of the product to be deleted
	 * 
	 * @return true if the product is found and deleted, else false
	 */
	public boolean removeProduct(int productId);
}
