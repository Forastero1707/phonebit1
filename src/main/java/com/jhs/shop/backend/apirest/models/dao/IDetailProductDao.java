package com.jhs.shop.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jhs.shop.backend.apirest.models.entity.DetailProduct;
import com.jhs.shop.backend.apirest.models.entity.DetailProductPK;

public interface IDetailProductDao extends CrudRepository<DetailProduct, DetailProductPK>{

}
