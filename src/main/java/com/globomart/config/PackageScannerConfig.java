package com.globomart.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.globomart.controller", "com.globomart.entity","com.globomart.service", 
		"com.globomart.aspect", "com.globomart.dao", "com.globomart.exception", "com.globomart.model"})
public class PackageScannerConfig {

}
