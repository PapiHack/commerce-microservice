package com.commerce.microservice.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.commerce.microservice.utils.InheritColumns;

@Entity
@Table(name="reglement")
public class Reglement extends InheritColumns implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="num_reglement")
	private String numReglement;
	private double montant;
	@OneToOne
	private Commande commande;
	
	public String getNumReglement() {
		return numReglement;
	}
	
	public void setNumReglement(String numReglement) {
		this.numReglement = numReglement;
	}
	
	public double getMontant() {
		return montant;
	}
	
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Commande getCommande() {
		return commande;
	}
	
	public void setCommande(Commande commande) {
		this.commande = commande;
	}

}
