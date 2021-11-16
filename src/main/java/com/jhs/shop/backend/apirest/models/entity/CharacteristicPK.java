package com.jhs.shop.backend.apirest.models.entity;
import java.io.Serializable;
import java.util.Objects;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Embeddable
public class CharacteristicPK implements Serializable{	
	
	@Column(name = "categoryId")
	private Long categoryId;
	@Column(name = "subcategoryId")
	private Long subcategoryId;	
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	@Column(name = "id")
	private Long id;
	public CharacteristicPK(Long categoryId, Long subcategoryId, Long id) {
		super();
		this.categoryId = categoryId;
		this.subcategoryId = subcategoryId;
		this.id = id;
	}
	public CharacteristicPK() {
	
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
		
		CharacteristicPK that = (CharacteristicPK) o;
		
		return categoryId.equals(that.categoryId) && subcategoryId.equals(that.subcategoryId) && id.equals(that.id);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(categoryId,subcategoryId,id);
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
