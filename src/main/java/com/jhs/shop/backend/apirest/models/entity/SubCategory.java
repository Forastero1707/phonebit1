package com.jhs.shop.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="subcategory")
public class SubCategory implements Serializable {
	
	
	@Id 
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private Integer id;	
	private String title;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "subcategories")
    private List<Category> categories;	
	
	@OneToMany(mappedBy = "subcategory")
	Set<Relations> relations  = new HashSet<>();
	
	@JoinTable(
	        name = "subcategory_characteristic",
	        joinColumns = @JoinColumn(name = "subcategoryId", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="characteristicId", nullable = false)
	    )
	@ManyToMany(fetch=FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<Characteristic> characteristics;
	
	public SubCategory(Integer id, String title, List<Category> categories, List<Characteristic> characteristics) {
		
		this.id = id;
		this.title = title;
		this.categories = categories;
		this.characteristics = characteristics;
	}


	public SubCategory() {
		
	}


	/*
	@ManyToOne(fetch = FetchType.LAZY)
	private Category categoria;
	
	@OneToMany(fetch = FetchType.LAZY )
	@JoinColumn(name = "characteristicId")
	private List<Characteristic> items;
	*/	
	
	

	private static final long serialVersionUID = 1L;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public List<Category> getCategories() {
		return categories;
	}


	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}


	public List<Characteristic> getCharacteristics() {
		return characteristics;
	}


	public void setCharacteristics(List<Characteristic> characteristics) {
		this.characteristics = characteristics;
	}


	/*public Set<Relations> getRelations() {
		return relations;
	}*/


	public void setRelations(Set<Relations> relations) {
		this.relations = relations;
	}

	
}
