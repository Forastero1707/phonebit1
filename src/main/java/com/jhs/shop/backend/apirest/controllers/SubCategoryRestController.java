package com.jhs.shop.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jhs.shop.backend.apirest.models.entity.Category;
import com.jhs.shop.backend.apirest.models.entity.SubCategory;
import com.jhs.shop.backend.apirest.models.services.ISubCategoryService;

@CrossOrigin(origins = {"https://phonebit1.web.app", "http://localhost:4200", "*"}, methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT}, allowedHeaders = "*") 
@RestController
@RequestMapping("/api")
public class SubCategoryRestController {

	@Autowired
	private ISubCategoryService subcategoryService;
	
	@PostMapping("/subcategory/form")
	@Modifying(clearAutomatically = true)
	@ResponseStatus(HttpStatus.CREATED)
	public SubCategory create (@RequestBody SubCategory subcategory)
	{
		return subcategoryService.save(subcategory);
	}
	@GetMapping("/subcategories")
	public List<SubCategory> index(){
		return subcategoryService.findAll();
	}
	
}
