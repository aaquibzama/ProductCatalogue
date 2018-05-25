package com.globomart.config;

import java.util.Properties;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TestDbConfiguration extends HibernateConfiguration {

	@Override
	protected Properties hibernateProperties() {
		Properties properties = super.hibernateProperties();
        properties.put("hibernate.hbm2ddl.auto", "create");
        return properties;
	}
	
}
