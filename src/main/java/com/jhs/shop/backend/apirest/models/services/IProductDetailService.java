package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jhs.shop.backend.apirest.models.entity.ProductDetail;

@Service
public interface IProductDetailService {

	public List<ProductDetail> findAll();
	public ProductDetail save(ProductDetail productdetail);
	public Iterable<ProductDetail> saveAll(Iterable<ProductDetail> productsdetail);
	public ProductDetail findById(Integer id);
	public void delete(Integer id);
}
