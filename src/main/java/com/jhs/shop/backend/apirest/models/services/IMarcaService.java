package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import com.jhs.shop.backend.apirest.models.entity.Marca;

public interface IMarcaService {
	
	public List<Marca> findAll();
	public Marca save(Marca marca);
	public Marca findById(Long id);
	public void delete(Long id);
}
