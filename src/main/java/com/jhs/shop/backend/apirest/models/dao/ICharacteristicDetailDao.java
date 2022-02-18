package com.jhs.shop.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jhs.shop.backend.apirest.models.entity.CharacteristicDetail;

public interface ICharacteristicDetailDao extends CrudRepository<CharacteristicDetail, Integer> {

}
