package com.jhs.shop.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhs.shop.backend.apirest.models.entity.User;
import com.jhs.shop.backend.apirest.models.services.IUserService;
@CrossOrigin(origins = {"https://phonebit1.web.app", "http://localhost:4200", "*"}, allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class UserRestController {

	@Autowired
	private IUserService userService;
	
	@GetMapping("/users")
	public List<User> index(){
		return userService.findAll();	
	}
	
	@GetMapping("/user")
	public User usuario()
	{
		Long id=(long) 1;
		System.out.print(id);
		return userService.findById(id);	
	}

}
