package com.jhs.shop.backend.apirest.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.jhs.shop.backend.apirest.models.entity.ProductDetail;
import com.jhs.shop.backend.apirest.models.services.IProductDetailService;

@CrossOrigin(origins = { "https://phonebit1.web.app", "http://localhost:4200", "*"}, methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT}, allowedHeaders = "*") 
@RestController
@RequestMapping("/api")
public class ProductDetailRestController {

	@Autowired
	private IProductDetailService productodetalleService;
	
	private final Logger log = LoggerFactory.getLogger(ProductDetailRestController.class);
	
	@GetMapping("/productdetails")
	public List<ProductDetail> index(){
		return productodetalleService.findAll();
	}
	
	@PostMapping("/productdetails/formAll")
	@Modifying(clearAutomatically = true)
	@ResponseStatus(HttpStatus.CREATED)
	public Iterable<ProductDetail>  create(@RequestBody Iterable<ProductDetail> productosdetalle)
	{
		return productodetalleService.saveAll(productosdetalle);	
	}
}
