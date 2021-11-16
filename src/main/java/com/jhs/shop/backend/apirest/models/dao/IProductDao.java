package com.jhs.shop.backend.apirest.models.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.jhs.shop.backend.apirest.models.entity.Product;


public interface IProductDao extends CrudRepository<Product, Long> {
	
	 
	/*@Override
	default Optional<Product> findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Product> producto = this.findById(id);
	    if (producto.isPresent()) {
	        // remote call
	    	return producto;
	    }else {
	    	System.out.println("Hubo un error de ejecución");
	    	return null;
	    }
		
	}*/
}
