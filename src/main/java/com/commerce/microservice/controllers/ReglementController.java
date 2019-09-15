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

import com.commerce.microservice.beans.Reglement;
import com.commerce.microservice.repositories.ReglementRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description="CRUD sur les réglements")
public class ReglementController {
	
	@Autowired
	private ReglementRepository reglementRepo;
	
	@GetMapping("/reglements")
	@ApiOperation(value="Permet de recupérer tous les réglements.")
	public List<Reglement> getAll(){
		return this.reglementRepo.findAll();
	}
	
	@GetMapping("/reglements/{id}")
	@ApiOperation(value="Permet de recupérer un réglement via son identifiant.")
	public Optional<Reglement> get(@PathVariable Long id){
		return this.reglementRepo.findById(id);
	}
	
	@PostMapping("/reglements")
	@ApiOperation(value="Permet d'ajouter un réglement.")
	public void add(@RequestBody Reglement reglement) {
		this.reglementRepo.save(reglement);
	}
	
	@PutMapping("/reglements")
	@ApiOperation(value="Permet de mettre à jour les informations d'un réglement.")
	public void update(@RequestBody Reglement reglement) {
		this.reglementRepo.save(reglement);
	}
	
	@DeleteMapping("/reglements")
	@ApiOperation(value="Permet de supprimer un réglement.")
	public void remove(@RequestBody Reglement reglement) {
		this.reglementRepo.delete(reglement);
	}
	
	@DeleteMapping("/reglements/{id}")
	@ApiOperation(value="Permet de supprimer un réglement via son identifiant.")
	public void removeById(@PathVariable Long id) {
		this.reglementRepo.deleteById(id);
	}

}
