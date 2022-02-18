package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jhs.shop.backend.apirest.models.dao.ICharacteristicDao;
import com.jhs.shop.backend.apirest.models.entity.Characteristic;
import com.jhs.shop.backend.apirest.models.entity.SubCategory;
@Service
public class CharacteristicServiceImpl implements ICharacteristicService{
	
	@Autowired
	private ICharacteristicDao caracteristicaDao;

	@Override
	public List<Characteristic> findAll() {
		// TODO Auto-generated method stub
		return (List<Characteristic>) caracteristicaDao.findAll();
	}

	@Override
	public Characteristic save(Characteristic characteristic) {
		// TODO Auto-generated method stub
		return caracteristicaDao.save(characteristic);
	}

	@Override
	public Characteristic findById(Integer id) {
		// TODO Auto-generated method stub
		return null;//caracteristicaDao.findAllById(id);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		//caracteristicaDao.deleteById(id);		
	}

	@Override
	public List<Characteristic> findCharacteristicsByCategoryAndSubCategory(Integer categoryId, Integer subcategoryId) {
		// TODO Auto-generated method stub
		return caracteristicaDao.findCharacteristicsByCategoryAndSubCategory(categoryId, subcategoryId);
	}

	

	
}
