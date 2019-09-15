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
import com.commerce.microservice.beans.DetailCommande;
import com.commerce.microservice.repositories.DetailCommandeRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description="CRUD sur les details des commandes")
public class DetailCommandeController {
	
	@Autowired
	private DetailCommandeRepository detailComRepo;
	
	@GetMapping("/details-commandes")
	@ApiOperation(value="Permet de recupérer tous les details de toutes les commandes.")
	public List<DetailCommande> getAll(){
		return this.detailComRepo.findAll();
	}
	
	@GetMapping("/details-commandes/{id}")
	@ApiOperation(value="Permet de recupérer les details d'une commande via son identifiant.")
	public Optional<DetailCommande> get(@PathVariable Long id){
		return this.detailComRepo.findById(id);
	}
	
	@PostMapping("/details-commandes")
	@ApiOperation(value="Permet d'ajouter les détails d'une commande.")
	public void add(@RequestBody DetailCommande detailCommande) {
		this.detailComRepo.save(detailCommande);
	}
	
	@PutMapping("/details-commandes")
	@ApiOperation(value="Permet de mettre à jour les détails d'une commande.")
	public void update(@RequestBody DetailCommande detailCommande) {
		this.detailComRepo.save(detailCommande);
	}
	
	@DeleteMapping("/details-commandes")
	@ApiOperation(value="Permet de supprimer les informations d'une commande.")
	public void remove(@RequestBody DetailCommande detailCommande) {
		this.detailComRepo.delete(detailCommande);
	}
	
	@DeleteMapping("/details-commandes/{id}")
	@ApiOperation(value="Permet de supprimer les informations d'une commande via son identifiant.")
	public void removeById(@PathVariable Long id) {
		this.detailComRepo.deleteById(id);
	}

}
