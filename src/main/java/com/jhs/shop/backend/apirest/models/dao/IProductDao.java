package com.jhs.shop.backend.apirest.models.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.jhs.shop.backend.apirest.models.entity.Product;


public interface IProductDao extends CrudRepository<Product, Long> {
	
	 @Query(value="call get_products_x_category_subcategory_marca(:categoryId, :subcategoryId, :marcaId)", nativeQuery = true)
	 List<Product> findProductsCategorySubCategoryMarca(@Param("categoryId") Integer categoryId, @Param("subcategoryId") Integer subcategoryId, @Param("marcaId") Integer marcaId );
	 
	 @Query(value="call get_products_x_category_subcategory(:categoryId, :subcategoryId)", nativeQuery = true)	 
	 List<Product> findProductsCategorySubCategory(@Param("categoryId") Integer categoryId, @Param("subcategoryId") Integer subcategoryId);
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
