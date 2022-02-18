package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jhs.shop.backend.apirest.models.dao.IMarcaDao;
import com.jhs.shop.backend.apirest.models.entity.Marca;

@Service
public class MarcaServiceImpl implements IMarcaService{

	@Autowired
	private IMarcaDao marcaDao;
	
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
	public Marca findById(Integer id) {
		// TODO Auto-generated method stub
		return marcaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		marcaDao.deleteById(id);		
	}

}
