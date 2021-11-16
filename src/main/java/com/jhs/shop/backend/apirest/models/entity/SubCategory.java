package com.jhs.shop.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="subcategory")
public class SubCategory implements Serializable {
	
	
	@Id 
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private Long id;
	private String title;
	private Long categoryId;
	
	/*@ManyToOne(fetch = FetchType.LAZY)
	private Category categoria;
	
	@OneToMany(fetch = FetchType.LAZY )
	@JoinColumn(name = "characteristicId")
	private List<Characteristic> items;
	*/	
	public SubCategory() {		
		//items = new ArrayList<>();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
/*	public Category getCategoria() {
		return categoria;
	}
	public void setCategoria(Category categoria) {
		this.categoria = categoria;
	}
	
	public List<Characteristic> getItems() {
		return items;
	}
	public void setItems(List<Characteristic> items) {
		this.items = items;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
