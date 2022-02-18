package com.jhs.shop.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="characteristicdetail")
public class CharacteristicDetail  implements Serializable{
	
	
	@Id 
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private Long id;	
	private String title;
	
	@OneToMany(mappedBy = "characteristicdetail")
	Set<Relations> relations  = new HashSet<>();	
	
	@JsonIgnore
	@ManyToMany(mappedBy = "characteristicdetails")
    private List<Characteristic> characteristics;	
	
	public CharacteristicDetail(Long id, String title, List<Characteristic> characteristics) {
		
		this.id = id;
		this.title = title;
		this.characteristics = characteristics;	
		
	}

	public CharacteristicDetail() {	
	}
	
	public CharacteristicDetail(Long id, String title) {		
		this.id = id;
		this.title = title;
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
	
	public List<Characteristic> getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(List<Characteristic> characteristics) {
		this.characteristics = characteristics;
	}


	public Set<Relations> getRelations() {
		return relations;
	}

	public void setRelations(Set<Relations> relations) {
		this.relations = relations;
	}





	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
