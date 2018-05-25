package com.globomart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globomart.dao.ProductDao;

@Service
public class DeleteService {

	@Autowired
	private ProductDao dao;
	
	public void deleteProduct(Integer productID) {
		 dao.delete(productID);
	}
}
