package com.glaucus.java.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glaucus.java.assignment.model.Product;
import com.glaucus.java.assignment.service.ProductService;

/**
 * ProductController maps the incoming GET, POST, PUT and DELETE requests from client and delegates the further processing
 * to ProductServcice.java class
 *  
 * @author Rishabh Jain
 *
 */
@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductService productService;
	
	
	/**
	 * Maps the POST request to add a new product to the server. 
	 * 
	 * @param newProduct New product data
	 * 
	 * @return Saved product
	 */
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product newProduct) {
		
		return productService.addProduct(newProduct);
	}
	
	
	/**
	 * Maps the GET request to fetch all the products from the server.
	 * 
	 * @return List of all the products.
	 */
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		
		return productService.getAllProducts();
	}
	
	
	/**
	 * Maps the GET request to fetch the product by its ID.
	 * 
	 * @param productId Product Id of the product
	 * 
	 * @return Product
	 */
	@GetMapping("/products/{productId}")
	public Product getProductById(@PathVariable int productId) {
		
		return productService.getProductById(productId);
	}
	
	
	/**
	 * Maps the GET request to fetch the total number of products.
	 * 
	 * @return Total number of products
	 */
	@GetMapping("/products/count")
	public long getTotalNumberOfProducts() {
		return productService.getTotalNumberOfProducts();
	}
	
	
	/**
	 * Maps the PUT request to update the product.
	 * 
	 * @param productId Product Id of the product
	 * @param updatedProduct Updated details of the existing product
	 * 
	 * @return Updated Product 
	 */
	@PutMapping("/products/{productId}")
	public Product updateProduct(@PathVariable int productId, 
									@RequestBody Product updatedProduct) {
		
		return productService.updateProduct(productId, updatedProduct);
	}
	
	
	/**
	 * Maps the DELETE request to delete a product.
	 * 
	 * @param productId Product Id of the product to be deleted
	 * 
	 * @return true if the product is found and deleted, false if product is not found
	 */
	@DeleteMapping("/products/{productId}")
	public boolean removeProduct(@PathVariable int productId) {
		
		return productService.removeProduct(productId);
	}

}
