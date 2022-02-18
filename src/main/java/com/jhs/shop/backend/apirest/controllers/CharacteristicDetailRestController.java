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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jhs.shop.backend.apirest.models.entity.CharacteristicDetail;
import com.jhs.shop.backend.apirest.models.services.ICharacteristicDetailService;

@CrossOrigin(origins = {"https://phonebit1.web.app", "http://localhost:4200", "*"}, allowedHeaders = "*") 
@RestController
@RequestMapping("/api")

public class CharacteristicDetailRestController {
	@Autowired
	private ICharacteristicDetailService characteristicdetailService;
	
	private final Logger log = LoggerFactory.getLogger(CategoryRestController.class);
	
	@GetMapping("/characteristicsdetails")
	public List<CharacteristicDetail> index(){
		return characteristicdetailService.findAll();
	}
	
	
	@PostMapping("/characteristicsdetails/form")
	@Modifying(clearAutomatically = true)
	@ResponseStatus(HttpStatus.CREATED)
	public CharacteristicDetail create(@RequestBody CharacteristicDetail characteristicdetail) {
		return characteristicdetailService.save(characteristicdetail);
	}

}
