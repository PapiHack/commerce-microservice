package com.commerce.microservice.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.commerce.microservice.utils.InheritColumns;

@Entity
@Table(name="client")
public class Client extends InheritColumns implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="code_client")
	private String codeClient;
	@Column(name="nom_client")
	private String nomClient;
	@ManyToOne
	private Representant representant;
	
	public String getCodeClient() {
		return codeClient;
	}
	
	public void setCodeClient(String codeClient) {
		this.codeClient = codeClient;
	}
	
	public String getNomClient() {
		return nomClient;
	}
	
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	
	public Representant getRepresentant() {
		return representant;
	}
	
	public void setRepresentant(Representant representant) {
		this.representant = representant;
	}

}
