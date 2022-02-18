package com.jhs.shop.backend.apirest.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jhs.shop.backend.apirest.models.entity.Characteristic;
import com.jhs.shop.backend.apirest.models.entity.Relations;
import com.jhs.shop.backend.apirest.models.entity.SubCategory;
import com.jhs.shop.backend.apirest.models.services.IRelationsService;

@CrossOrigin(origins = {"https://phonebit1.web.app", "http://localhost:4200", "*"}, allowedHeaders = "*") 
@RestController
@RequestMapping("/api")
public class RelationsRestController {

	@Autowired
	private IRelationsService relationsService;
	
	private final Logger log = LoggerFactory.getLogger(CategoryRestController.class);
	
	@GetMapping("/relations")
	public List<Relations> index(){
		return relationsService.findAll();
	}
	@PostMapping("/relations/form")
	@Modifying(clearAutomatically = true)
	@ResponseStatus(HttpStatus.CREATED)
	public Relations create (@RequestBody Relations relations)
	{
		return relationsService.save(relations);
	}
	
	@GetMapping("/relations/characteristics")
	public List<Characteristic> characteristics(Integer categoryId, Integer subcategoryId){
		return null;
	}
	
	@Transactional
	@GetMapping("/relations/{categoryId}/{subcategoryId}/{characteristicId}/{characteristicdetailId}")
	public Integer characteristics(@PathVariable Integer categoryId, @PathVariable Integer subcategoryId, @PathVariable Integer characteristicId, @PathVariable Integer characteristicdetailId){
		Integer  resultado ;
		System.out.println("Hola antes de entrar");
		resultado = relationsService.findIdRelation(categoryId, subcategoryId, characteristicId, characteristicdetailId);
		System.out.println("El nro devuelto es : " + resultado.toString());
		return resultado;
	}
}
