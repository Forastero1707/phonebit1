package com.jhs.shop.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="category")
public class Category implements Serializable{
	
	
	@Id	
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private Integer id;
	private Integer parentId;
	private String title;
	private String metaTitle;
	private String slug;
	private String content;
	private String link;	
	
	@JoinTable(
	        name = "category_subcategory",
	        joinColumns = @JoinColumn(name = "categoryId", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="subcategoryId", nullable = false)
	    )
	@ManyToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<SubCategory> subcategories;
	
	@OneToMany(mappedBy = "category")
	Set<Relations> relations  = new HashSet<>();	
	
	public Category() 
	{
				//items = new ArrayList<>();
	}
	
	public Category(Integer id, Integer parentId, String title, String metaTitle, String slug, String content, String link, List<SubCategory> subcategories) {
		this.id = id;
		this.parentId = parentId;
		this.title = title;
		this.metaTitle = metaTitle;
		this.slug = slug;
		this.content = content;
		this.link = link;
		this.subcategories = subcategories;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMetaTitle() {
		return metaTitle;
	}
	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	
	/*public List<SubCategory> getItems() {
		return items;
	}

	public void setItems(List<SubCategory> items) {
		this.items = items;
	}*/
	
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}


	public List<SubCategory> getSubcategories() {
		return subcategories;
	}

	public void setSubcategories(List<SubCategory> subcategories) {
		this.subcategories = subcategories;
	}	

	/*public Set<Relations> getRelations() {
		return relations;
	}*/

	public void setRelations(Set<Relations> relations) {
		this.relations = relations;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
