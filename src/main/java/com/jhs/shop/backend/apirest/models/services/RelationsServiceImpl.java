package com.jhs.shop.backend.apirest.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jhs.shop.backend.apirest.models.dao.IRelationsDao;
import com.jhs.shop.backend.apirest.models.entity.Characteristic;
import com.jhs.shop.backend.apirest.models.entity.Relations;

@Service
public class RelationsServiceImpl implements IRelationsService {

	@Autowired
	private IRelationsDao relationsDao;
	
	@Override
	public List<Relations> findAll() {
		// TODO Auto-generated method stub
		return (List<Relations>) relationsDao.findAll();
	}

	@Override
	public Relations save(Relations relations) {
		// TODO Auto-generated method stub
		return relationsDao.save(relations);
	}

	@Override
	public Relations findById(Integer id) {
		// TODO Auto-generated method stub
		return relationsDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		relationsDao.deleteById(id);		
	}

	@Override
	public List<Characteristic> findByCategoryAndSubCategory(Integer categoryId, Integer subcategoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer findIdRelation(Integer categoryId, Integer subcategoryId, Integer characteristicId,
			Integer characteristicdetailId) {
		// TODO Auto-generated method stub
		return relationsDao.findIdRelation(categoryId, subcategoryId, characteristicId, characteristicdetailId);
	}

}

