package com.jhs.shop.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="relations")
public class Relations implements Serializable {
	
	
	@Id 
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private Long id;
	/*private Long categoryId;
	private Long subcategoryId;
	private Long characteristicId;
	private Long characteristicdetailId;*/
	
	@ManyToOne
	@JoinColumn(name="category_id")
	Category category;
	
	@ManyToOne
	@JoinColumn(name="subcategory_id")
	SubCategory subcategory;
	
	@ManyToOne
	@JoinColumn(name="characteristic_id")
	Characteristic characteristic;
	
	@ManyToOne
	@JoinColumn(name="characteristicdetail_id")
	CharacteristicDetail characteristicdetail;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	/*public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public Long getSubcategoryId() {
		return subcategoryId;
	}
	public void setSubcategoryId(Long subcategoryId) {
		this.subcategoryId = subcategoryId;
	}
	public Long getCharacteristicId() {
		return characteristicId;
	}
	public void setCharacteristicId(Long characteristicId) {
		this.characteristicId = characteristicId;
	}
	public Long getCharacteristicdetailId() {
		return characteristicdetailId;
	}
	public void setCharacteristicdetailId(Long characteristicdetailId) {
		this.characteristicdetailId = characteristicdetailId; }*/
	
	
	
	/*public Category getCategory() {
		return category;
	}*/
	public void setCategory(Category category) {
		this.category = category;
	}
	/*public SubCategory getSubcategory() {
		return subcategory;
	}*/
	public void setSubcategory(SubCategory subcategory) {
		this.subcategory = subcategory;
	}
	/*public Characteristic getCharacteristic() {
		return characteristic;
	}*/
	public void setCharacteristic(Characteristic characteristic) {
		this.characteristic = characteristic;
	}	

	/*public CharacteristicDetail getCharacteristicdetail() {
		return characteristicdetail;
	}*/
	public void setCharacteristicdetail(CharacteristicDetail characteristicdetail) {
		this.characteristicdetail = characteristicdetail;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
