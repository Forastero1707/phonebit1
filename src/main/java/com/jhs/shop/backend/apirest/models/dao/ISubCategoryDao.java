package com.jhs.shop.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jhs.shop.backend.apirest.models.entity.SubCategory;

public interface ISubCategoryDao extends CrudRepository<SubCategory, Long> {

}
