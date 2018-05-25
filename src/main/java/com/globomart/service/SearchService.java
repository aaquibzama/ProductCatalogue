package com.globomart.service;

import java.util.List;

import com.globomart.entity.ProductDetails;
import com.globomart.exception.SearchByIDException;

public interface SearchService {
	
	ProductDetails getProductByID(int productID) throws SearchByIDException;
	List<ProductDetails> getAllProducts(Integer limit, String prodName) throws SearchByIDException;

}
