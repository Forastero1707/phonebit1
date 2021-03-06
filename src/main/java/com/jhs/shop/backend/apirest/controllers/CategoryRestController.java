package com.jhs.shop.backend.apirest.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jhs.shop.backend.apirest.models.entity.Category;
import com.jhs.shop.backend.apirest.models.entity.Characteristic;
import com.jhs.shop.backend.apirest.models.entity.SubCategory;
import com.jhs.shop.backend.apirest.models.services.ICategoryService;

@CrossOrigin(origins = {"https://phonebit1.web.app", "http://localhost:4200", "*"}, allowedHeaders = "*") 
@RestController
@RequestMapping("/api")

public class CategoryRestController {
	
	@Autowired
	private ICategoryService categoryService;
	
	private final Logger log = LoggerFactory.getLogger(CategoryRestController.class);

	@GetMapping("/categories")
	public List<Category> index(){
		return categoryService.findAll();
	}
	
	@PostMapping("/categoryform")
	@Modifying(clearAutomatically = true)
	@ResponseStatus(HttpStatus.CREATED)
	public Category create(@RequestBody Category category) {
		return categoryService.save(category);
	}
	
	
}
