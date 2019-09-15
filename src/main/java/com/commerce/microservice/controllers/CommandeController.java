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

@RestController
public class CommandeController {
	
	@Autowired
	private CommandeRepository commandeRepo;
	
	@GetMapping("/commandes")
	public List<Commande> getAll(){
		return this.commandeRepo.findAll();
	}
	
	@GetMapping("/commandes/{id}")
	public Optional<Commande> get(@PathVariable Long id){
		return this.commandeRepo.findById(id);
	}
	
	@PostMapping("/commandes")
	public void add(@RequestBody Commande commande) {
		this.commandeRepo.save(commande);
	}
	
	@PutMapping("/commandes")
	public void update(@RequestBody Commande commande) {
		this.commandeRepo.save(commande);
	}
	
	@DeleteMapping("/commandes")
	public void remove(@RequestBody Commande commande) {
		this.commandeRepo.delete(commande);
	}
	
	@DeleteMapping("/commandes/{id}")
	public void removeById(@PathVariable Long id) {
		this.commandeRepo.deleteById(id);
	}

}
