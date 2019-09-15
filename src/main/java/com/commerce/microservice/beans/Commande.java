package com.commerce.microservice.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.commerce.microservice.utils.InheritColumns;

@Entity
@Table(name="commande")
public class Commande extends InheritColumns implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double montant;
	private double reliquat;
	@OneToOne
	private Client client;
	
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	public double getReliquat() {
		return reliquat;
	}
	
	public void setReliquat(double reliquat) {
		this.reliquat = reliquat;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
}
