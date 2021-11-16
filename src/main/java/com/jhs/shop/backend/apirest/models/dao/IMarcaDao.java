package com.jhs.shop.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jhs.shop.backend.apirest.models.entity.Marca;


public interface IMarcaDao extends CrudRepository<Marca, Long>{

}
