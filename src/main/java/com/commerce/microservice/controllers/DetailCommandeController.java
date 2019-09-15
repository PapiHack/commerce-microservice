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

@RestController
public class DetailCommandeController {
	
	@Autowired
	private DetailCommandeRepository detailComRepo;
	
	@GetMapping("/details-commandes")
	public List<DetailCommande> getAll(){
		return this.detailComRepo.findAll();
	}
	
	@GetMapping("/details-commandes/{id}")
	public Optional<DetailCommande> get(@PathVariable Long id){
		return this.detailComRepo.findById(id);
	}
	
	@PostMapping("/details-commandes")
	public void add(@RequestBody DetailCommande detailCommande) {
		this.detailComRepo.save(detailCommande);
	}
	
	@PutMapping("/details-commandes")
	public void update(@RequestBody DetailCommande detailCommande) {
		this.detailComRepo.save(detailCommande);
	}
	
	@DeleteMapping("/details-commandes")
	public void remove(@RequestBody DetailCommande detailCommande) {
		this.detailComRepo.delete(detailCommande);
	}
	
	@DeleteMapping("/details-commandes/{id}")
	public void removeById(@PathVariable Long id) {
		this.detailComRepo.deleteById(id);
	}

}
