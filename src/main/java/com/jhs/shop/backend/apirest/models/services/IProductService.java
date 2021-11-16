package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.jhs.shop.backend.apirest.models.entity.Product;

@Service
public interface IProductService {
	public List<Product> findAll();
	public Product save(Product producto);
	public Product findById(Long id);
	public Page<Product> findAll(Pageable pageable);
	public void delete(Long id );
}
