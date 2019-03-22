package com.glaucus.java.assignment.dao.impl;

import static com.glaucus.java.assignment.constants.Constants.GET_ALL_PRODUCTS_QUERY;

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
}
