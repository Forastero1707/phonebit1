package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.jhs.shop.backend.apirest.models.entity.Marca;

public class MarcaServiceImpl implements IMarcaService{

	@Autowired
	private IMarcaService marcaDao;
	
	@Override
	@Transactional
	public List<Marca> findAll() {
		// TODO Auto-generated method stub
		return (List<Marca>) marcaDao.findAll();
	}

	@Override
	@Transactional
	public Marca save(Marca marca) {
		// TODO Auto-generated method stub
		return marcaDao.save(marca);
	}

	@Override
	@Transactional
	public Marca findById(Long id) {
		// TODO Auto-generated method stub
		return marcaDao.findById(id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		marcaDao.delete(id);
		
	}

}
