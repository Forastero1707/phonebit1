package com.jhs.shop.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jhs.shop.backend.apirest.models.entity.ProductDetail;

public interface IProductDetailDao extends CrudRepository<ProductDetail, Integer> {

}
