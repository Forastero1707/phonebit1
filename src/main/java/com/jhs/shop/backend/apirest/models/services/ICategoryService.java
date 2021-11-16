package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jhs.shop.backend.apirest.models.entity.Category;

@Service
public interface ICategoryService {

	public List<Category> findAll();
	public Category save(Category categoria);
	public Category findById(Long id);
	public void delete(Long id);
	
	
	
	/*
	 public List<Product> findAll();
	public Product save(Product producto);
	public Product findById(Long id);
	public Page<Product> findAll(Pageable pageable);
	public void delete(Long id );
	 
	 */
}
