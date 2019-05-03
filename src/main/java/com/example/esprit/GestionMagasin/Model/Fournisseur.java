package com.example.esprit.GestionMagasin.Model;


import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



import java.util.Date;





@Entity
@Table(name="FOURNISSEUR")
public class Fournisseur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="FOURNISSEUR_ID", updatable = false, nullable = false)
	private Long idFournisseur;
	@Column(name="LIBELLE_FOURNISSEUR")
	private String libelleFournisseur;
	 @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_CREACTION")
		private Date  dateCreaction;
	
	/**
	 * @return the createAt
	 */
	
	/**
	 * @return the idFournisseur
	 */
	
	/**
	 * @return the createAt
	 */
	
	/**
	 * @return the libelleFournisseur
	 */
	public String getLibelleFournisseur() {
		return libelleFournisseur;
	}
	public Fournisseur() {
		super();
	}
	/**
	 * @return the dateCreaction
	 */
	public Date getDateCreaction() {
		return dateCreaction;
	}

	/**
	 * @param dateCreaction the dateCreaction to set
	 */
	public void setDateCreaction(Date dateCreaction) {
		this.dateCreaction = dateCreaction;
	}

	/**
	 * @param libelleFournisseur the libelleFournisseur to set
	 */
	public void setLibelleFournisseur(String libelleFournisseur) {
		this.libelleFournisseur = libelleFournisseur;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override       
	public String toString() {
		return "Fournisseur [idFournisseur=" + idFournisseur + ", libelleFournisseur=" + libelleFournisseur + "]";
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
	public Fournisseur(Long idFournisseur, String libelleFournisseur, Date dateCreaction) {
		super();
		this.idFournisseur = idFournisseur;
		this.libelleFournisseur = libelleFournisseur;
		this.dateCreaction = dateCreaction;
	}
	
	
	

}
