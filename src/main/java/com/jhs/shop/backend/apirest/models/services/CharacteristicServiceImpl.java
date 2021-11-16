package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.jhs.shop.backend.apirest.models.dao.ICharacteristicDao;
import com.jhs.shop.backend.apirest.models.entity.Characteristic;
import com.jhs.shop.backend.apirest.models.entity.CharacteristicPK;

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
	public Characteristic findById(CharacteristicPK clave) {
		// TODO Auto-generated method stub
		return caracteristicaDao.findById(clave).orElse(null);
	}

	@Override
	public void delete(CharacteristicPK clave) {
		// TODO Auto-generated method stub
		caracteristicaDao.deleteById(clave);		
	}
}
