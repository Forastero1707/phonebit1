package com.jhs.shop.backend.apirest.models.services;
import java.util.List;
import org.springframework.stereotype.Service;
import com.jhs.shop.backend.apirest.models.entity.Characteristic;

@Service
public interface ICharacteristicService {
	public List<Characteristic> findAll();
	public Characteristic save(Characteristic characteristic);
	public Characteristic findById(Integer id);	
	public void delete(Integer id);
	public List<Characteristic> findCharacteristicsByCategoryAndSubCategory(Integer categoryId, Integer subcategoryId);
}
