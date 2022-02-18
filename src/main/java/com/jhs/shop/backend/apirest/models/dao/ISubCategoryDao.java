package com.jhs.shop.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jhs.shop.backend.apirest.models.entity.SubCategory;

public interface ISubCategoryDao extends CrudRepository<SubCategory, Integer>
{
	
}
