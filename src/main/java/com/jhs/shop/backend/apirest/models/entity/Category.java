package com.jhs.shop.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category implements Serializable{
	
	
	@Id	
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private Long id;
	private Long parentId;
	private String title;
	private String metaTitle;
	private String slug;
	private String content;
	private String link;
	
	/*@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "categoryId")
	private List<SubCategory> items;*/
	
	
	
	public Category() 
	{
				//items = new ArrayList<>();
	}
	
	public Category(Long id, Long parentId, String title, String metaTitle, String slug, String content, String link) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.title = title;
		this.metaTitle = metaTitle;
		this.slug = slug;
		this.content = content;
		this.link = link;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
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


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
