package com.jhs.shop.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class DetailProductPK implements Serializable{

	@Column(name = "categoryId")
	private Long categoryId;
	@Column(name = "subcategoryId")
	private Long subcategoryId;
	@Column(name = "characteristicId")
	private Long characteristicId;
	@Column(name = "productId")
	private Long productId;	
	@Column(name = "id")
	private Long id;
	public DetailProductPK() {
		
	}
	public DetailProductPK(Long categoryId, Long subcategoryId, Long characteristicId, Long productId, Long id) {
		super();
		this.categoryId = categoryId;
		this.subcategoryId = subcategoryId;
		this.characteristicId = characteristicId;
		this.productId = productId;
		this.id = id;
	}
	public Long getCategoryId() {
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
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		
		if ( o == null || getClass() != o.getClass()) return false;
		
		DetailProductPK that = (DetailProductPK) o;
		
		return categoryId.equals(that.categoryId) && subcategoryId.equals(that.subcategoryId) && characteristicId.equals(that.characteristicId) && productId.equals(that.productId) && id.equals(that.id);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(categoryId,subcategoryId, characteristicId, productId,id);
	}
	
	
	
}
