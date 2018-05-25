package com.globomart.service;

import java.util.List;

import org.apache.commons.lang.math.NumberUtils;
import org.h2.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globomart.dao.ProductDao;
import com.globomart.entity.ProductDetails;
import com.globomart.exception.SearchByIDException;

@Service
public class SearchServiceImpl implements SearchService {

	final int DEFAULT_SIZE = 10;
	@Autowired
	private ProductDao dao;
	
	@Override
	public ProductDetails getProductByID(int productID) throws SearchByIDException {
		 System.out.println("Get product by empID");
		 List<ProductDetails> result = dao.getProductsById(productID);
		 if(result.size() == 1) {
			 return result.get(0);
		 } else {
			 throw new SearchByIDException("1000", "Could not find the exact product for productID: " + productID);
		 }
	}

	@Override
	public List<ProductDetails> getAllProducts(Integer limit, String productName) throws SearchByIDException {
		 System.out.println("Get all products");
		 List<ProductDetails> result;
		 Integer requiredLimit = (limit==null || NumberUtils.INTEGER_ZERO.equals(limit)) ? DEFAULT_SIZE : limit;
		 if(StringUtils.isNullOrEmpty(productName)) {
			 result = dao.getAllProducts(requiredLimit);
		 } else {
			 result = dao.getProductsByName(productName,requiredLimit);
		 }
		 if(result.size() > 0) {
			 return result;
		 } else {
			 throw new SearchByIDException("1000", "Could not find the exact product for productName: " + productName);
		 }
	}
	

}
