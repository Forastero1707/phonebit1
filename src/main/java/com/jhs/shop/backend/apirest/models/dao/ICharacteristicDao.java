package com.jhs.shop.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jhs.shop.backend.apirest.models.entity.Characteristic;
import com.jhs.shop.backend.apirest.models.entity.SubCategory;

public interface ICharacteristicDao extends CrudRepository<Characteristic, Integer>{
	
	@Query("SELECT s.characteristics FROM  Category c JOIN c.subcategories s WHERE c.id = ?1 AND s.id = ?2")
	List<Characteristic> findCharacteristicsByCategoryAndSubCategory(@Param("categoryId") Integer categoryId, @Param("subcategoryId") Integer subcategoryId);
}
