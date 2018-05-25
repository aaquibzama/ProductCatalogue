package com.globomart.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.globomart.aspect.ExceptionHandlerAspect;
import com.globomart.config.AspectConfiguration;
import com.globomart.config.TestDbConfiguration;
import com.globomart.entity.ProductDetails;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestDbConfiguration.class, ProductDaoImpl.class, ExceptionHandlerAspect.class,
		AspectConfiguration.class })
public class ProductDaoIt {
	@Autowired
	private ProductDao dao;

	@Test
	public void testSave() {
		System.out.println("Starting Save Test");
		ProductDetails entity = new ProductDetails();
		entity.setProductID(100);
		entity.setProductName("Wonderful product");
		entity.setProductType("Electronic");
		dao.save(entity);
		System.out.println("Ending Save Test");
	}
	
	@Test
	public void testGetAll() {
		System.out.println("Starting GetAll Test");
		List<ProductDetails> daoList = dao.getAllProducts(10);
		daoList.forEach(System.out::print);
		System.out.println("Starting GetAll Test");
	}

}
