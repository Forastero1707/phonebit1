package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.jhs.shop.backend.apirest.models.entity.Category;
import com.jhs.shop.backend.apirest.models.entity.Characteristic;
import com.jhs.shop.backend.apirest.models.entity.SubCategory;

@Service
@Transactional
public interface ICategoryService {

	public List<Category> findAll();
	public Category save(Category categoria);
	public Category findById(Integer id);
	public List<SubCategory> findSubcategoryBycategoryId(Integer id);
	public void delete(Integer id);	
	
	
	
	/*
	 public List<Product> findAll();
	public Product save(Product producto);
	public Product findById(Long id);
	public Page<Product> findAll(Pageable pageable);
	public void delete(Long id );
	 
	 */
}
