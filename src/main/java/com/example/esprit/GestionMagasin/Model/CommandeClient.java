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
@Table(name="COMMANDE_CLIENT")
public class CommandeClient implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="CATEGORY_ID", updatable = false, nullable = false)
	private Long idCommande;
	@Column(name="LIBELLE_COMMANDE")
	private String LibelleCommande;
	@Column(name="ID_PRODUIT")
	private String idProduit;
	@Column(name="LIBELLE_PRODUIT")
	private String libelleProduit;
	@Column(name="ID_CLIENT")
	private String idClient;
	@Column(name="NOM_CLIENT")
	private String NomClient;
	@Column(name="QTE")
	private Long qte;
	@Column(name="TOTAL_FACTURE")
	private Long prixTotal;

	 @Temporal(TemporalType.TIMESTAMP)
		@Column(name = "CREATE_DATE")
		private Date  createAt;

	/**
 * @return the qte
 */
public Long getQte() {
	return qte;
}
/**
 * @param qte the qte to set
 */
public void setQte(Long qte) {
	this.qte = qte;
}
/**
 * @return the prixTotal
 */
public Long getPrixTotal() {
	return prixTotal;
}
/**
 * @param prixTotal the prixTotal to set
 */
public void setPrixTotal(Long prixTotal) {
	this.prixTotal = prixTotal;
}
	/**
 * @return the createAt
 */

	/**
	 * @return the idCommande
	
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
	 * @return the libelleCommande
	 */
	public String getLibelleCommande() {
		return LibelleCommande;
	}
	/**
	 * @param libelleCommande the libelleCommande to set
	 */
	public void setLibelleCommande(String libelleCommande) {
		LibelleCommande = libelleCommande;
	}
	/**
	 * @return the idProduit
	 */
	public String getIdProduit() {
		return idProduit;
	}
	/**
	 * @param idProduit the idProduit to set
	 */
	public void setIdProduit(String idProduit) {
		this.idProduit = idProduit;
	}
	/**
	 * @return the libelleProduit
	 */
	public String getLibelleProduit() {
		return libelleProduit;
	}
	/**
	 * @param libelleProduit the libelleProduit to set
	 */
	public void setLibelleProduit(String libelleProduit) {
		this.libelleProduit = libelleProduit;
	}
	/**
	 * @return the idClient
	 */
	public String getIdClient() {
		return idClient;
	}
	/**
	 * @param idClient the idClient to set
	 */
	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}
	/**
	 * @return the nomClient
	 */
	public String getNomClient() {
		return NomClient;
	}
	/**
	 * @param nomClient the nomClient to set
	 */
	public void setNomClient(String nomClient) {
		NomClient = nomClient;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", LibelleCommande=" + LibelleCommande + ", idProduit="
				+ idProduit + ", libelleProduit=" + libelleProduit + ", idClient=" + idClient + ", NomClient="
				+ NomClient + "]";
	}
	public CommandeClient() {
		super();
	}
	/**
	 * @return the createDt
	 */
	/**
	 * @return the idCommande
	 */
	public Long getIdCommande() {
		return idCommande;
	}
	/**
	 * @param idCommande the idCommande to set
	 */
	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}
	public CommandeClient(Long idCommande, String libelleCommande, String idProduit, String libelleProduit,
			String idClient, String nomClient, Long qte, Long prixTotal, Date createAt) {
		super();
		this.idCommande = idCommande;
		LibelleCommande = libelleCommande;
		this.idProduit = idProduit;
		this.libelleProduit = libelleProduit;
		this.idClient = idClient;
		NomClient = nomClient;
		this.qte = qte;
		this.prixTotal = prixTotal;
		this.createAt = createAt;
	}
	
	
	
	
	
	

}
