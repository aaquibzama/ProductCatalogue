package com.globomart.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.globomart.entity.ProductDetails;
import com.globomart.exception.SearchByIDException;
import com.globomart.model.ProductRequest;
import com.globomart.service.AddService;
import com.globomart.service.DeleteService;
import com.globomart.service.SearchService;

/**
 * @author azama
 *
 */
@RestController
@RequestMapping(value = "product")
public class CatalogueController {
	@Autowired
	private SearchService searchService;
	@Autowired
	private AddService addService;
	@Autowired
	private DeleteService deleteService;

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public List<ProductDetails> getAllProducts(@RequestParam(value = "limit", required = false) Integer limit,
			@RequestParam(value = "name", required = false) String name) throws SearchByIDException {
		System.out.println("All Prod" + limit + " " + name);
		return searchService.getAllProducts(limit, name);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/")
	public String addProduct(@RequestBody ProductRequest product) {
		addService.addProduct(product);
		return "SUCCESS";
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		deleteService.deleteProduct(id);
		return "SUCCESS";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ProductDetails getProductByID(@PathVariable("id") int id) throws Exception {
		return searchService.getProductByID(id);
	}

}
