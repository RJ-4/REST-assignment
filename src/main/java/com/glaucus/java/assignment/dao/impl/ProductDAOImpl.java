package com.glaucus.java.assignment.dao.impl;

import static com.glaucus.java.assignment.constants.Constants.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.glaucus.java.assignment.dao.ProductDAO;
import com.glaucus.java.assignment.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	EntityManager entityManager;
	
	@Override
	public Product addProduct(Product newProduct) {

		Session session = entityManager.unwrap(Session.class);
		session.save(newProduct);
		return newProduct;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProducts() {
		
		Session session = entityManager.unwrap(Session.class);
		String getAllProductsQuery = GET_ALL_PRODUCTS_QUERY;
		Query query = session.createQuery(getAllProductsQuery);
		List<Product> products = query.getResultList();
		return products;
	}

	@Override
	public Product getProductById(int productId) {
		
		Session session = entityManager.unwrap(Session.class);
		Product product = session.get(Product.class, productId);
		return product;
	}

	@Override
	public long getTotalNumberOfProducts() {
		
		Session session = entityManager.unwrap(Session.class);
		String getTotalNumberOfProductsQuery = GET_TOTAL_NUMBER_OF_PRODUCTS_QUERY;
		Query query = session.createQuery(getTotalNumberOfProductsQuery);
		Long totalNumberOfProducts = (Long) query.getSingleResult();
		System.out.println("TOTAL PRODUCTS: " + totalNumberOfProducts);
		return totalNumberOfProducts;
	}

	@Override
	public Product updateProduct(int productId, Product updatedProduct) {
		
		Session session = entityManager.unwrap(Session.class);
		Product existingProduct = session.get(Product.class, productId);
		if(updatedProduct.getDescription() != null) {
			existingProduct.setDescription(updatedProduct.getDescription());
		}
		if(updatedProduct.getName() != null) {
			existingProduct.setName(updatedProduct.getName());
		}
		if(updatedProduct.getUnitPrice() != 0) {
			existingProduct.setUnitPrice(updatedProduct.getUnitPrice());
		}
		existingProduct.setStock(updatedProduct.getStock());
		return existingProduct;
	}

	@Override
	public boolean removeProduct(int productId) {
		
		Session session = entityManager.unwrap(Session.class);
		Product product = session.get(Product.class, productId);
		if(product == null) {
			return false;
		}
		session.delete(product);
		return true;
	}
}
