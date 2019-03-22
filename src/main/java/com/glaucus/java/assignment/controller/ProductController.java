package com.glaucus.java.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glaucus.java.assignment.model.Product;
import com.glaucus.java.assignment.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product newProduct) {
		
		return productService.addProduct(newProduct);
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		
		return productService.getAllProducts();
	}
	
	@GetMapping("/products/{productId}")
	public Product getProductById(@PathVariable int productId) {
		
		return productService.getProductById(productId);
	}
	
	@GetMapping("/products/count")
	public long getTotalNumberOfProducts() {
		
		return productService.getTotalNumberOfProducts();
	}
	
	@PutMapping("/products/{productId}")
	public Product updateProduct(@PathVariable int productId, 
									@RequestBody Product updatedProduct) {
		
		return productService.updateProduct(productId, updatedProduct);
	}

}
