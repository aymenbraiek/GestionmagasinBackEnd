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
@Table(name="COMMANDE_FOURNISSEUR")
public class Commande_Fournisseur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="COMMANDE_ID", updatable = false, nullable = false)
	private Long idCommande;
	@Column(name="LIBELLE_COMMANDE")
	private String LibelleCommande;
	@Column(name="ID_PRODUIT")
	private Long idProduit;
	@Column(name="LIBELLE_PRODUIT")
	private String libelleProduit;
	
	private Long idFournisseur;
	@Column(name="LIBELLE_FOURNISSEUR")
	private String libelleFournisseur;
	@Column(name="QTE")
	private Long qte;
	@Column(name="PRIX")
	private Long prix;
	@Column(name="TOTAL_FACTURE")
	private Long prixTotal;
	
		@Column(name = "CREATE_DATE")
		private String  createAt;
	
	

	/**
	 * @param createAt the createAt to set
	 */
	
	/**
	 * @return the createAt
	 */
	
	/**
	 * @return the idCommande
	 */
	
	/**
	 * @return the libelleCommande
	 */
	public String getLibelleCommande() {
		return LibelleCommande;
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
	 * @param libelleCommande the libelleCommande to set
	 */
	public void setLibelleCommande(String libelleCommande) {
		LibelleCommande = libelleCommande;
	}
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
	 * @param libelleProduit the libelleProduit to set
	 */
	public void setLibelleProduit(String libelleProduit) {
		this.libelleProduit = libelleProduit;
	}
	/**
	 * @return the idFournisseur
	 */
	
	/**
	 * @return the libelleFournisseur
	 */
	public String getLibelleFournisseur() {
		return libelleFournisseur;
	}
	/**
	 * @param libelleFournisseur the libelleFournisseur to set
	 */
	public void setLibelleFournisseur(String libelleFournisseur) {
		this.libelleFournisseur = libelleFournisseur;
	}
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
	public Commande_Fournisseur() {
		super();
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
	 * @return the idFournisseur
	 */
	public Long getIdFournisseur() {
		return idFournisseur;
	}
	/**
	 * @param idFournisseur the idFournisseur to set
	 */
	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Commande_Fournisseur [idCommande=" + idCommande + ", LibelleCommande=" + LibelleCommande
				+ ", idProduit=" + idProduit + ", libelleProduit=" + libelleProduit + ", idFournisseur=" + idFournisseur
				+ ", libelleFournisseur=" + libelleFournisseur + ", qte=" + qte + ", prixTotal=" + prixTotal + "]";
	}
	public Commande_Fournisseur(Long idCommande, String libelleCommande, Long idProduit, String libelleProduit,
			Long idFournisseur, String libelleFournisseur, Long qte, Long prixTotal, String createAt) {
		super();
		this.idCommande = idCommande;
		LibelleCommande = libelleCommande;
		this.idProduit = idProduit;
		this.libelleProduit = libelleProduit;
		this.idFournisseur = idFournisseur;
		this.libelleFournisseur = libelleFournisseur;
		this.qte = qte;
		this.prixTotal = prixTotal;
		this.createAt = createAt;
	}
	
}
