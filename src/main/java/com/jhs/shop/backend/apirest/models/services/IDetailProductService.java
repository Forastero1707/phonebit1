package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jhs.shop.backend.apirest.models.entity.DetailProduct;
import com.jhs.shop.backend.apirest.models.entity.DetailProductPK;

@Service
public interface IDetailProductService {
	public List<DetailProduct> findAll();
	public DetailProduct save(DetailProduct productoDetalle);
	public DetailProduct findByID(DetailProductPK clave);
	public void delete(DetailProductPK clave);
	
}
