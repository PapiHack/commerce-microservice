package com.commerce.microservice.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.commerce.microservice.utils.InheritColumns;

@Entity
@Table(name="produit")
public class Produit extends InheritColumns implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String code;
	private String designation;
	@Column(name="prix_unitaire")
	private double prixUnitaire;
	@ManyToOne
	private DetailCommande detailCommande;
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public double getPrixUnitaire() {
		return prixUnitaire;
	}
	
	public void setPrixUnitaire(double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

}
