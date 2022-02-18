package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhs.shop.backend.apirest.models.dao.ICharacteristicDetailDao;
import com.jhs.shop.backend.apirest.models.entity.CharacteristicDetail;
@Service
public class CharacteristicDetailServiceImpl implements ICharacteristicDetailService {

	@Autowired
	private ICharacteristicDetailDao characteristicdetailDao;
	
	@Override
	public List<CharacteristicDetail> findAll() {
		// TODO Auto-generated method stub
		return (List<CharacteristicDetail>) characteristicdetailDao.findAll();
	}

	@Override
	public CharacteristicDetail save(CharacteristicDetail characteristicdetail) {
		// TODO Auto-generated method stub
		return characteristicdetailDao.save(characteristicdetail);
	}

	@Override
	public CharacteristicDetail findById(Integer id) {
		// TODO Auto-generated method stub
		return characteristicdetailDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		characteristicdetailDao.deleteById(id);
	}
	

}
