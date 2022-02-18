package com.jhs.shop.backend.apirest.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jhs.shop.backend.apirest.models.entity.Marca;
import com.jhs.shop.backend.apirest.models.services.IMarcaService;

@CrossOrigin(origins = {"https://phonebit1.web.app", "http://localhost:4200", "*"}, methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT}, allowedHeaders = "*") 
@RestController
@RequestMapping("/api")
public class MarcaRestController {
	
	@Autowired
	private IMarcaService marcaService;
	
	private final Logger log = LoggerFactory.getLogger(MarcaRestController.class);
	
	@GetMapping("/marcas")
	public List<Marca> index()
	{
		return marcaService.findAll();
	}
	
	@GetMapping("/marca/{id}")
	public Marca findMarcabyId(@PathVariable  Integer id) {
		return marcaService.findById(id);
	}
	

}
