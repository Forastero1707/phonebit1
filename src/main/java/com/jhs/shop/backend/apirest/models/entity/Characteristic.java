package com.jhs.shop.backend.apirest.models.entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
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

@Entity
@Table(name="characteristic")
public class Characteristic implements Serializable{

	@Id 
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private Long id;	
	private String title;	
	
	@JsonIgnore
	@ManyToMany(mappedBy = "characteristics")
    private List<SubCategory> subcategories;	
	
	@OneToMany(mappedBy = "characteristic")
	Set<Relations> relations  = new HashSet<>();
	
	@JoinTable(
	        name = "characteristic_characteristicdetail", 
	        joinColumns = @JoinColumn(name = "characteristicId", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="characteristicdetailId", nullable = false)
	    )
	@ManyToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@Fetch(value = FetchMode.SUBSELECT)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<CharacteristicDetail> characteristicdetails;
	
	public Characteristic(Long id, String title, List<SubCategory> subcategories, List<CharacteristicDetail> characteristicdetails) {		
		this.id = id;
		this.title = title;
		this.subcategories = subcategories;
		this.characteristicdetails = characteristicdetails;
	}

	public Characteristic() {
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
	
	
	public List<SubCategory> getSubcategories() {
		return subcategories;
	}

	public void setSubcategories(List<SubCategory> subcategories) {
		this.subcategories = subcategories;
	}


	public List<CharacteristicDetail> getCharacteristicdetails() {
		return characteristicdetails;
	}

	public void setCharacteristicdetails(List<CharacteristicDetail> characteristicdetails) {
		this.characteristicdetails = characteristicdetails;
	}


	/*public Set<Relations> getRelations() {
		return relations;
	}*/

	public void setRelations(Set<Relations> relations) {
		this.relations = relations;
	}


	private static final long serialVersionUID = 1L;
	
	
}
