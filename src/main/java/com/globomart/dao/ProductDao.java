package com.globomart.dao;

import java.util.List;

import com.globomart.entity.ProductDetails;

public interface ProductDao {
	void save(ProductDetails productDetails);
	List<ProductDetails> getAllProducts(Integer limit);
	List<ProductDetails> getProductsByName(String productName, Integer limit);
	List<ProductDetails> getProductsById(int productId);
	void delete(Integer productID);
}