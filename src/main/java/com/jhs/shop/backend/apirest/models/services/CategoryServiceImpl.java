package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jhs.shop.backend.apirest.models.dao.ICategoryDao;
import com.jhs.shop.backend.apirest.models.entity.Category;

@Service
public class CategoryServiceImpl implements ICategoryService{
	
	@Autowired
	private ICategoryDao categoriaDao;
	

	@Override
	@Transactional
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		
		return (List<Category>) categoriaDao.findAll();
	}

	@Override
	@Transactional
	public Category save(Category categoria) {
		// TODO Auto-generated method stub
		System.out.print("El id a Grabar es :_" + categoria.getId());
		return categoriaDao.save(categoria);
	}

	@Override
	public Category findById(Long id) {
		// TODO Auto-generated method stub
		return categoriaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		categoriaDao.deleteById(id);		
	}
}
