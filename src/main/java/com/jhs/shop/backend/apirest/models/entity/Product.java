package com.jhs.shop.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="product")
public class Product implements Serializable {
	
	@Id 
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private Long id;
	private Long userId;	
	private String title;
	private Long marcaId;	
	@PrePersist
	public void marcaIdPrePersist() {
		this.userId = new Long(1);
		this.marcaId = new Long(1);
	}
	
	private String metaTitle;
	private String slug;
	private String summary;
	private int type;
	private String sku;
	private float price;
	private float discount;
	private int quantity;
	private int shop;	
	private Date createdAt;
	private Date updatedAt;
	private Date publishedAt;
	private Date startsAt;
	private Date endsAt;
	private String content;
	
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name = "productId", nullable = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<DetailProduct> items;
	
	/*@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id", nullable=false, insertable=false, updatable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private User user;	*/
	
	
	
	public Product(Long id, Long userId, String title, Long marcaId,String metaTitle, String slug, String summary, int type,
			String sku, float price, float discount, int quantity, int shop, Date createdAt, Date updatedAt,
			Date publishedAt, Date startsAt, Date endsAt, String content, User user) {
		super();
		this.id = id;	
		this.userId = userId;
		this.title = title;
		this.metaTitle = metaTitle;
		this.marcaId = marcaId;
		this.slug = slug;
		this.summary = summary;
		this.type = type;
		this.sku = sku;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
		this.shop = shop;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.publishedAt = publishedAt;
		this.startsAt = startsAt;
		this.endsAt = endsAt;
		this.content = content;
		//this.user = user;
	}
	
	public Product() {
		items = new ArrayList<>();
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

	

	public Long getMarcaId() {
		return marcaId;
	}

	public void setMarcaId(Long marcaId) {
		this.marcaId = marcaId;
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
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getShop() {
		return shop;
	}
	public void setShop(int shop) {
		this.shop = shop;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updateAt) {
		this.updatedAt = updateAt;
	}
	public Date getPublishedAt() {
		return publishedAt;
	}
	public void setPublishedAt(Date publishedAt) {
		this.publishedAt = publishedAt;
	}
	public Date getStartsAt() {
		return startsAt;
	}
	public void setStartsAt(Date startsAt) {
		this.startsAt = startsAt;
	}
	public Date getEndsAt() {
		return endsAt;
	}
	public void setEndsAt(Date endsAt) {
		this.endsAt = endsAt;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	/*public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}*/



	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public List<DetailProduct> getItems() {
		return items;
	}

	public void setItems(List<DetailProduct> items) {
		this.items = items;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
