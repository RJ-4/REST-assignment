package com.glaucus.java.assignment.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glaucus.java.assignment.dao.ProductDAO;
import com.glaucus.java.assignment.model.Product;
import com.glaucus.java.assignment.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;
	
	@Override
	@Transactional
	public Product addProduct(Product newProduct) {

		return productDAO.addProduct(newProduct);
	}

	@Override
	@Transactional
	public List<Product> getAllProducts() {
		
		return productDAO.getAllProducts();
	}

	@Override
	@Transactional
	public Product getProductById(int productId) {
		
		return productDAO.getProductById(productId);
	}

}
