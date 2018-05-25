package com.globomart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globomart.dao.ProductDao;
import com.globomart.entity.ProductDetails;
import com.globomart.model.ProductRequest;

@Service
public class AddService {

	@Autowired
	private ProductDao dao;
	
	public void addProduct(ProductRequest product) {
		 ProductDetails productDetails = new ProductDetails();
		 productDetails.setProductID(product.getProductID());
		 productDetails.setProductName(product.getProductName());
		 productDetails.setProductType(product.getProductType());
		 dao.save(productDetails);
	}
}
