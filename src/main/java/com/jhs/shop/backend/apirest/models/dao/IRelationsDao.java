package com.jhs.shop.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jhs.shop.backend.apirest.models.entity.Characteristic;
import com.jhs.shop.backend.apirest.models.entity.Product;
import com.jhs.shop.backend.apirest.models.entity.Relations;


public interface IRelationsDao extends CrudRepository<Relations, Integer> {	
	
	//@Query("select r.id from Relations r where r.categoryId = ?1 and r.subcategoryId = ?2 and r.characteristicId = ?3 and r.characteristicdetailId = ?4")
	@Query(value="select id from relations where category_id = :categoryId and subcategory_id = :subcategoryId and characteristic_id = :characteristicId and characteristicdetail_id = :characteristicdetailId", nativeQuery = true)
	Integer findIdRelation(@Param("categoryId") Integer categoryId, 
							@Param("subcategoryId") Integer subcategoryId, 
							@Param("characteristicId") Integer characteristicId, 
							@Param("characteristicdetailId") Integer characteristicdetailId);
}
