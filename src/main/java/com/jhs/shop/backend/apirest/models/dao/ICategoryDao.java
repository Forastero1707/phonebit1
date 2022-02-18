package com.jhs.shop.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jhs.shop.backend.apirest.models.entity.Category;
import com.jhs.shop.backend.apirest.models.entity.Characteristic;
import com.jhs.shop.backend.apirest.models.entity.SubCategory;

public interface ICategoryDao extends CrudRepository<Category, Integer>{


	/*@Query("select o from Owner o where o.ownerId IN (Select c.ownerId from Cars c) "
			+ "select c from Category c where c.categoryId IN (Select s from SubCategory where ())")
	
	@Query("select ch from (select c.subcategories from Category c where c.id = ?1)")	*/
	
	
	
	@Query("Select c.subcategories from Category c where c.id = ?1")
	List<SubCategory> findSubcategoryBycategoryId(Integer id);
}
