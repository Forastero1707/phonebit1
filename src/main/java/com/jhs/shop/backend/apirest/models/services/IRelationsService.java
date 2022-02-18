package com.jhs.shop.backend.apirest.models.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jhs.shop.backend.apirest.models.entity.Characteristic;
import com.jhs.shop.backend.apirest.models.entity.Relations;

@Service
public interface IRelationsService {

	public List<Relations> findAll();
	public Relations save(Relations relations);
	public Relations findById(Integer id);
	public void delete(Integer id);
	public List<Characteristic> findByCategoryAndSubCategory(Integer categoryId, Integer subcategoryId);
	public Integer findIdRelation(Integer categoryId, Integer subcategoryId, Integer characteristicId, Integer characteristicdetailId);
	
}
