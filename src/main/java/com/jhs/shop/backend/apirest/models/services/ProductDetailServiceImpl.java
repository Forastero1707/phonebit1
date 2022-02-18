package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jhs.shop.backend.apirest.models.dao.IProductDetailDao;
import com.jhs.shop.backend.apirest.models.entity.Category;
import com.jhs.shop.backend.apirest.models.entity.ProductDetail;

@Service
public class ProductDetailServiceImpl implements IProductDetailService {

	@Autowired
	private IProductDetailDao productdetailDao;
	
	@Override
	public List<ProductDetail> findAll() {
		// TODO Auto-generated method stub
		return (List<ProductDetail>) productdetailDao.findAll();
	}

	@Override
	public ProductDetail save(ProductDetail productdetail) {
		// TODO Auto-generated method stub
		return productdetailDao.save(productdetail);
	}

	@Override
	public ProductDetail findById(Integer id) {
		// TODO Auto-generated method stub
		return productdetailDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		productdetailDao.deleteById(id);
		
	}
	@Transactional
	@Override
	public Iterable<ProductDetail> saveAll(Iterable<ProductDetail> productsdetail) {
		// TODO Auto-generated method stub	
		
			return productdetailDao.saveAll(productsdetail);		
	}

}
