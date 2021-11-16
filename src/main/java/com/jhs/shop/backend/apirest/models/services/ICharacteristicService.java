package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jhs.shop.backend.apirest.models.entity.Characteristic;
import com.jhs.shop.backend.apirest.models.entity.CharacteristicPK;

@Service
public interface ICharacteristicService {
	public List<Characteristic> findAll();
	public Characteristic save(Characteristic characteristic);
	public Characteristic findById(CharacteristicPK clave);
	public void delete(CharacteristicPK clave);
}
