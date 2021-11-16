package com.jhs.shop.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jhs.shop.backend.apirest.models.entity.Characteristic;
import com.jhs.shop.backend.apirest.models.entity.CharacteristicPK;

public interface ICharacteristicDao extends CrudRepository<Characteristic, CharacteristicPK>{
	

}
