package com.globomart.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.globomart.entity.ProductDetails;

@Transactional
@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(ProductDetails productDetails) {
		Session openSession = sessionFactory.openSession();
		openSession.save(productDetails);
		openSession.flush();
		openSession.close();
	}
	
	@Override
	public void delete(Integer productID) {
		Session openSession = sessionFactory.openSession();
		String hql = "delete from ProductDetails where productID= :productID";
		Query query = openSession.createQuery(hql);
		query.setParameter("productID", productID);
		query.executeUpdate();
		openSession.close();
	}
	
	@Override
	public List<ProductDetails> getAllProducts(Integer limit) {
		Session openSession = sessionFactory.openSession();
		String hql = "from ProductDetails";
		Query query = openSession.createQuery(hql);
		query.setMaxResults(limit);
		List<ProductDetails> results = query.list();
		openSession.close();
		return results;
	}
	
	@Override
	public List<ProductDetails> getProductsByName(String productName, Integer limit) {
		Session openSession = sessionFactory.openSession();
		String hql = "from ProductDetails where productName= :name";
		Query query = openSession.createQuery(hql);
		query.setParameter("name", productName);
		query.setMaxResults(limit);
		List<ProductDetails> results = query.list();
		openSession.close();
		return results;
	}
	
	@Override
	public List<ProductDetails> getProductsById(int productId) {
		Session openSession = sessionFactory.openSession();
		String hql = "from ProductDetails where productID = :id";
		Query query = openSession.createQuery(hql);
		query.setParameter("id", productId);
		List<ProductDetails> results = query.list();
		openSession.close();
		return results;
	}
	
	
}
