package com.jhs.shop.backend.apirest.models.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.jhs.shop.backend.apirest.models.entity.User;

public interface IUserDao extends CrudRepository<User, Long> {

	
}
