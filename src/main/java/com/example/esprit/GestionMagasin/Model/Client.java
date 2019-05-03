package com.example.esprit.GestionMagasin.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="CLIENT")
public class Client  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
    @Column(name ="CLIENT_ID", updatable = false, nullable = false)
	private Long idClient;
	@Column(name="NAME")
	private String name;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="ADRESSE")
	private String adresse;
	@Column(name="TEL")
	private Long tel;
	/**
	 * @return the idClient
	 */
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the idClient
	 */
	public Long getIdClient() {
		return idClient;
	}
	/**
	 * @param idClient the idClient to set
	 */
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * @return the tel
	 */
	public Long getTel() {
		return tel;
	}
	/**
	 * @param tel the tel to set
	 */
	public void setTel(Long tel) {
		this.tel = tel;
	}
	
	public Client(Long idClient, String name, String lastName, String adresse, Long tel) {
		super();
		this.idClient = idClient;
		this.name = name;
		this.lastName = lastName;
		this.adresse = adresse;
		this.tel = tel;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", name=" + name + ", lastName=" + lastName + ", adresse=" + adresse
				+ ", tel=" + tel + "]";
	}
	
	
	
	

}
