package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import org.springframework.stereotype.Service;


import com.jhs.shop.backend.apirest.models.entity.CharacteristicDetail;

@Service
public interface ICharacteristicDetailService {

	public List<CharacteristicDetail> findAll();
	public CharacteristicDetail save(CharacteristicDetail characteristicdetail);
	public CharacteristicDetail findById(Integer id);
	public void delete(Integer id);
}
