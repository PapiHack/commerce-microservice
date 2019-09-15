package com.commerce.microservice.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.commerce.microservice.beans.Produit;
import com.commerce.microservice.repositories.ProduitRepository;

@RestController
public class ProduitController {
	
	@Autowired
	private ProduitRepository produitRepo;
	
	@GetMapping("/produits")
	public List<Produit> getAll(){
		return this.produitRepo.findAll();
	}
	
	@GetMapping("/produits/{id}")
	public Optional<Produit> get(@PathVariable Long id){
		return this.produitRepo.findById(id);
	}
	
	@PostMapping("/produits")
	public void add(@RequestBody Produit produit) {
		this.produitRepo.save(produit);
	}
	
	@PutMapping("/produits")
	public void update(@RequestBody Produit produit) {
		this.produitRepo.save(produit);
	}
	
	@DeleteMapping("/produits")
	public void removeById(@RequestBody Produit produit) {
		this.produitRepo.delete(produit);
	}
	
	@DeleteMapping("/produits/{id}")
	public void removeById(@PathVariable Long id) {
		this.produitRepo.deleteById(id);
	}

}
