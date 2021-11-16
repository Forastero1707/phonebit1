package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.jhs.shop.backend.apirest.models.dao.IDetailProductDao;
import com.jhs.shop.backend.apirest.models.entity.DetailProduct;
import com.jhs.shop.backend.apirest.models.entity.DetailProductPK;


public class DetailProductServiceImpl implements IDetailProductService{
	
	@Autowired
	private IDetailProductDao detailProductoDao;

	@Override
	@Transactional(readOnly = true)
	public List<DetailProduct> findAll() {
		// TODO Auto-generated method stub
		return (List<DetailProduct>) detailProductoDao.findAll();
	}

	@Override
	@Transactional
	public DetailProduct save(DetailProduct productoDetalle) {
		// TODO Auto-generated method stub
		return detailProductoDao.save(productoDetalle);
	}

	@Override
	@Transactional(readOnly = true)
	public DetailProduct findByID(DetailProductPK clave) {
		// TODO Auto-generated method stub
		return detailProductoDao.findById(clave).orElse(null);
	}

	@Override
	public void delete(DetailProductPK clave) {
		// TODO Auto-generated method stub
		detailProductoDao.deleteById(clave);
	}

	
	

}
