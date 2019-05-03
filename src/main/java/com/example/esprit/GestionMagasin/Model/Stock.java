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
@Table(name="STOCK")
public class Stock implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="STOCK_ID", updatable = false, nullable = false)
private Long idStock;
	@Column(name="PRODUIT_ID")		
private Long idProduit;
	@Column(name="LIBELLE_PRODUIT")	
private String libelleProduit;
@Column(name="QUALITE")	
private Long quatite;
@Column(name="PRIX")	
private String prix;

	@Column(name = "CREATE_DATE")
	private String  createAt;

/**
 * @return the createAt
 */

/**
 * @return the idStock
 */

/**
 * @return the idProduit
 */

/**
 * @return the libelleProduit
 */
public String getLibelleProduit() {
	return libelleProduit;
}
/**
 * @return the createAt
 */
public String getCreateAt() {
	return createAt;
}
/**
 * @param createAt the createAt to set
 */
public void setCreateAt(String createAt) {
	this.createAt = createAt;
}

/**
 * @return the idStock
 */
public Long getIdStock() {
	return idStock;
}
/**
 * @param idStock the idStock to set
 */
public void setIdStock(Long idStock) {
	this.idStock = idStock;
}
public Stock(Long idStock, Long idProduit, String libelleProduit, Long quatite, String prix, String createAt) {
	super();
	this.idStock = idStock;
	this.idProduit = idProduit;
	this.libelleProduit = libelleProduit;
	this.quatite = quatite;
	this.prix = prix;
	this.createAt = createAt;
}
/**
 * @return the idProduit
 */
public Long getIdProduit() {
	return idProduit;
}
/**
 * @param idProduit the idProduit to set
 */
public void setIdProduit(Long idProduit) {
	this.idProduit = idProduit;
}
/**
 * @param libelleProduit the libelleProduit to set
 */
public void setLibelleProduit(String libelleProduit) {
	this.libelleProduit = libelleProduit;
}
/**
 * @return the quatite
 */

/**
 * @return the prix
 */
public String getPrix() {
	return prix;
}
/**
 * @return the quatite
 */
public Long getQuatite() {
	return quatite;
}
/**
 * @param quatite the quatite to set
 */
public void setQuatite(Long quatite) {
	this.quatite = quatite;
}
/**
 * @param prix the prix to set
 */
public void setPrix(String prix) {
	this.prix = prix;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Stock [idStock=" + idStock + ", idProduit=" + idProduit + ", libelleProduit=" + libelleProduit
			+ ", quatite=" + quatite + ", prix=" + prix + "]";
}
public Stock() {
	super();
}


}
