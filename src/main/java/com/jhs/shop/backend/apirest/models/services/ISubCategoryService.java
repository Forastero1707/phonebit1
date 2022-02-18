package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import com.jhs.shop.backend.apirest.models.entity.SubCategory;

public interface ISubCategoryService {

	public List<SubCategory> findAll();
	public SubCategory findById(Integer id);
	public SubCategory save(SubCategory subcategory);
	
}
