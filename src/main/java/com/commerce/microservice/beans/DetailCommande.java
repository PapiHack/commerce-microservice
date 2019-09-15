package com.commerce.microservice.beans;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.commerce.microservice.utils.InheritColumns;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="detail_commande")
public class DetailCommande extends InheritColumns implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int quantite;
	@OneToOne
	private Commande commande;
	@OneToMany(mappedBy="detailCommande")
	@JsonBackReference
	private Set<Produit> produits;
	
	public int getQuantite() {
		return quantite;
	}
	
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public Commande getCommande() {
		return commande;
	}
	
	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Set<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}

}
