package com.globomart.config;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.globomart.entity.ProductDetails;

@Transactional 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDbConfiguration.class)
public class HibernateConfigurationIt {
	@Autowired
	@Qualifier(value="hibernateSessionFactory")
	private SessionFactory sessionFactory;
	
	@Test
	public void testConnection() {
		ProductDetails entity = new ProductDetails();
		entity.setProductID(10);
		
		Session session = sessionFactory.openSession();
		session.save(entity);
		session.flush();
        session.close();
	}

	
}
