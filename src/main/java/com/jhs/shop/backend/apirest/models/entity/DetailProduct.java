package com.jhs.shop.backend.apirest.models.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detailproducto")
public class DetailProduct implements Serializable{
	
	@EmbeddedId
	
	private DetailProductPK llavesPrimarias;	
	 
    private String title;        
    
   /* @ManyToOne(fetch = FetchType.LAZY)
    private Category categoria;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private SubCategory subcategoria;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Characteristic caracteristica;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Product producto;   */ 
    
	

	public DetailProductPK getLlavesPrimarias() {
		return llavesPrimarias;
	}



	public void setLlavesPrimarias(DetailProductPK llavesPrimarias) {
		this.llavesPrimarias = llavesPrimarias;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	/*public Category getCategoria() {
		return categoria;
	}



	public void setCategoria(Category categoria) {
		this.categoria = categoria;
	}



	public SubCategory getSubcategoria() {
		return subcategoria;
	}



	public void setSubcategoria(SubCategory subcategoria) {
		this.subcategoria = subcategoria;
	}



	public Characteristic getCaracteristica() {
		return caracteristica;
	}



	public void setCaracteristica(Characteristic caracteristica) {
		this.caracteristica = caracteristica;
	}



	public Product getProducto() {
		return producto;
	}



	public void setProducto(Product producto) {
		this.producto = producto;
	}*/



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;    
    

}
