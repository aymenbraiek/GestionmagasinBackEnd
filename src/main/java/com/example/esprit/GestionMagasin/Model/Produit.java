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
@Table(name="PRODUIT")
public class Produit  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="PRODUIT_ID", updatable = false, nullable = false)
	
	private Long idProduit;
	@Column(name="LIBELLE_PRODUIT")
 private String libelle;
	@Column(name="CATEGORIE_ID")
private Long idCategorie;
	@Column(name="LIBELLE_CATEGORIE")
private String libelleCategorie;

	
	
		@Column(name = "CREATE_DATE")
		private String  createAt;
	
/**
	 * @return the createAt
	 */
	
	/**
	 * @param createAt the createAt to set
	 */
	
/**
	 * @return the createAt
	 */


/**
 * @return the createAt
 */

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
 * @param createAt the createAt to set
 */

/**
 * @param idProduit the idProduit to set
 */

/**
 * @return the libelle
 */
public String getLibelle() {
	return libelle;
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
 * @param libelle the libelle to set
 */
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
/**
 * @return the idCategorie
 */

/**
 * @return the libelleCategorie
 */
public String getLibelleCategorie() {
	return libelleCategorie;
}
/**
 * @return the idCategorie
 */
public Long getIdCategorie() {
	return idCategorie;
}
/**
 * @param idCategorie the idCategorie to set
 */
public void setIdCategorie(Long idCategorie) {
	this.idCategorie = idCategorie;
}
/**
 * @param libelleCategorie the libelleCategorie to set
 */
public void setLibelleCategorie(String libelleCategorie) {
	this.libelleCategorie = libelleCategorie;
}
/**
 * @return the idCommande
 */


public Produit() {
	super();
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
public Produit(Long idProduit, String libelle, Long idCategorie, String libelleCategorie, String createAt) {
	super();
	this.idProduit = idProduit;
	this.libelle = libelle;
	this.idCategorie = idCategorie;
	this.libelleCategorie = libelleCategorie;
	this.createAt = createAt;
}


}
