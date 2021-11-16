package com.jhs.shop.backend.apirest.models.entity;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.IdClass;
@Entity
@Table(name="characteristic")
public class Characteristic {

	@EmbeddedId
	private CharacteristicPK llavesPrimarias;
	
	private String title;	
	
	/*@ManyToOne( fetch = FetchType.LAZY)	
	private SubCategory subcategoria;
	
	@ManyToOne(fetch = FetchType.LAZY)	
	private Category categoria;*/
	
	public Characteristic(CharacteristicPK llavesPrimarias, String title) {	
		super();
		this.llavesPrimarias = llavesPrimarias;
		this.title = title;
		/*this.subcategoria = subcategoria;
		this.categoria = categoria;*/
	}
	public Characteristic() {
	}	
	
	
	public CharacteristicPK getLlavesPrimarias() {
		return llavesPrimarias;
	}
	public void setLlavesPrimarias(CharacteristicPK llavesPrimarias) {
		this.llavesPrimarias = llavesPrimarias;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
