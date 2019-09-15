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

import com.commerce.microservice.beans.Commande;
import com.commerce.microservice.repositories.CommandeRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description="CRUD sur les commandes")
public class CommandeController {
	
	@Autowired
	private CommandeRepository commandeRepo;
	
	@GetMapping("/commandes")
	@ApiOperation(value="Permet de recupérer toutes les commandes.")
	public List<Commande> getAll(){
		return this.commandeRepo.findAll();
	}
	
	@GetMapping("/commandes/{id}")
	@ApiOperation(value="Permet de recupérer une commande via son identifiant.")
	public Optional<Commande> get(@PathVariable Long id){
		return this.commandeRepo.findById(id);
	}
	
	@PostMapping("/commandes")
	@ApiOperation(value="Permet d'ajouter une commande.")
	public void add(@RequestBody Commande commande) {
		this.commandeRepo.save(commande);
	}
	
	@PutMapping("/commandes")
	@ApiOperation(value="Permet de mettre à jour une commande.")
	public void update(@RequestBody Commande commande) {
		this.commandeRepo.save(commande);
	}
	
	@DeleteMapping("/commandes")
	@ApiOperation(value="Permet de supprimer une commande.")
	public void remove(@RequestBody Commande commande) {
		this.commandeRepo.delete(commande);
	}
	
	@DeleteMapping("/commandes/{id}")
	@ApiOperation(value="Permet de supprimer une commande via son identifiant.")
	public void removeById(@PathVariable Long id) {
		this.commandeRepo.deleteById(id);
	}

}
