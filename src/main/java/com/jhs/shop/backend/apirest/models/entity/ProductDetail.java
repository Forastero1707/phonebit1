package com.jhs.shop.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="productdetail")
public class ProductDetail implements Serializable{
	
	@Id	
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private Long id;	
	
	private Long productId;
	
	private Long relationId;
    
   /* @ManyToOne(fetch = FetchType.LAZY)
    private Category categoria;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private SubCategory subcategoria;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Characteristic caracteristica;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Product producto;   */     
	

	
	
	private static final long serialVersionUID = 1L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getRelationId() {
		return relationId;
	}

	public void setRelationId(Long relationId) {
		this.relationId = relationId;
	}

	
    

}