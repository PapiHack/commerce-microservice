package com.commerce.microservice.beans;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.commerce.microservice.utils.InheritColumns;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="representant")
public class Representant extends InheritColumns implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="code_representant")
	private String codeRepresentant;
	@Column(name="nom_representant")
	private String nomRepresentant;
	@OneToMany(mappedBy="representant")
	@JsonBackReference
	private Set<Client> clients;
	
	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	public String getCodeRepresentant() {
		return codeRepresentant;
	}

	public void setCodeRepresentant(String codeRepresentant) {
		this.codeRepresentant = codeRepresentant;
	}
	
	public String getNomRepresentant() {
		return nomRepresentant;
	}
	
	public void setNomRepresentant(String nomRepresentant) {
		this.nomRepresentant = nomRepresentant;
	}

}
