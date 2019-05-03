package com.example.esprit.GestionMagasin.Model;


import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="CATEGORY")
public class Category implements Serializable {
	
	/**         
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name ="CATEGORY_ID", updatable = false, nullable = false)
	private Long idCategory;
	@Column(name="CATEGORY_LIBELLE")
	private String libelleCategory;
	 @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE")
	private Date  createAt;
	/**
	 * @return the idCategory
	 */
	
	
	
	/**
	 * @return the createAt
	 */
	public Date getCreateAt() {
		return createAt;
	}

	/**
	 * @param createAt the createAt to set
	 */
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	/**
	 * @param idCategory the idCategory to set
	 */
	
	/**
	 * @return the libelleCategory
	 */
	public String getLibelleCategory() {
		return libelleCategory;
	}
	/**
	 * @return the idCategory
	 */
	public Long getIdCategory() {
		return idCategory;
	}

	/**
	 * @param idCategory the idCategory to set
	 */
	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}

	/**
	 * @param libelleCategory the libelleCategory to set
	 */
	public void setLibelleCategory(String libelleCategory) {
		this.libelleCategory = libelleCategory;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Category [idCategory=" + idCategory + ", libelleCategory=" + libelleCategory + "]";
	}
	public Category() {
		super();
	}
	
	public Category(String libelleCategory, Date createAt) {
		super();
		this.libelleCategory = libelleCategory;
		this.createAt = createAt;
	}

	public Category(Long idCategory, String libelleCategory, Date createAt) {
		super();
		this.idCategory = idCategory;
		this.libelleCategory = libelleCategory;
		this.createAt = createAt;
	}
	

	
	
	

}
