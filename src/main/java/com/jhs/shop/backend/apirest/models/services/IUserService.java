package com.jhs.shop.backend.apirest.models.services;

import java.util.List;

import com.jhs.shop.backend.apirest.models.entity.User;

public interface IUserService {
	public List<User> findAll();
	public User findById(Long id);
}
