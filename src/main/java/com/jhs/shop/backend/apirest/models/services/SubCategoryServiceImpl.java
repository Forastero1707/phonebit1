package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jhs.shop.backend.apirest.models.dao.ISubCategoryDao;
import com.jhs.shop.backend.apirest.models.entity.SubCategory;

@Service
public class SubCategoryServiceImpl implements ISubCategoryService{

	@Autowired
	private ISubCategoryDao subcategoriaDao;

	@Override
	public List<SubCategory> findAll() {
		// TODO Auto-generated method stub
		return (List<SubCategory>) subcategoriaDao.findAll();
	}

	@Override
	public SubCategory findById(Integer id) {
		// TODO Auto-generated method stub
		return subcategoriaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public SubCategory save(SubCategory subcategory) {
		// TODO Auto-generated method stub
		return subcategoriaDao.save(subcategory);
	}

		
	
}
