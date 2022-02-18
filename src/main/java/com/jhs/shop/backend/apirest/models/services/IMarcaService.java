package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jhs.shop.backend.apirest.models.entity.Marca;

@Service
public interface IMarcaService {
	
	public List<Marca> findAll();
	public Marca save(Marca marca);
	public Marca findById(Integer id);
	public void delete(Integer id);
}
