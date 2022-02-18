package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amazonaws.services.s3.AmazonS3;
import com.jhs.shop.backend.apirest.models.dao.IProductDao;
import com.jhs.shop.backend.apirest.models.entity.Product;

@Service
public class ProductServiceImpl implements IProductService{

	@Autowired
	private IProductDao productDao;
	
	@Autowired
	private AmazonS3 amazonS3;
	
	@Value("aws.s3.bucket")
	private String bucketName;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Product> findAll() {		
		return (List<Product>) productDao.findAll();
	}

	@Override
	@Transactional
	public Product save(Product producto) {
		// TODO Auto-generated method stub
		System.out.println("El id a Grabar es : "+producto.getId());
		return productDao.save(producto);		
	}



	@Override
	public Page<Product> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		productDao.deleteById(id);
		
	}	
	@Override
	@Transactional(readOnly = true)
	public Product findById(Long id) {
		// TODO Auto-generated method stub
		System.out.println(" Estamos en el service dao y el Id es : " +  id + "Existe : " + productDao.count() + "Items");		
		return productDao.findById(id).orElse(null);
	}

	@Override
	public List<Product> findProductCategorySubCategoryMarca(Integer categoryId, Integer subcategoryId, Integer marcaId) {
		// TODO Auto-generated method stub
		return (List<Product>) productDao.findProductsCategorySubCategoryMarca(categoryId, subcategoryId, marcaId);
	}

	@Override
	public List<Product> findProductCategorySubCategory(Integer categoryId, Integer subcategoryId) {
		// TODO Auto-generated method stub
		return (List<Product>) productDao.findProductsCategorySubCategory(categoryId, subcategoryId);
	}

	

}
