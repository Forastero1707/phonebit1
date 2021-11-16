package com.jhs.shop.backend.apirest.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhs.shop.backend.apirest.models.entity.Category;
import com.jhs.shop.backend.apirest.models.services.ICategoryService;

@CrossOrigin(origins = { "http://localhost:4200"}) 
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
}
