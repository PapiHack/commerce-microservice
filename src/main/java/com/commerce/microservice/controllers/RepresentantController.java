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

import com.commerce.microservice.beans.Representant;
import com.commerce.microservice.repositories.RepresentantRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description="CRUD sur les représentants")
public class RepresentantController {
	
	@Autowired
	private RepresentantRepository representantRepo;
	
	@GetMapping("/representants")
	@ApiOperation(value="Permet de recupérer tous les représentants.")
	public List<Representant> getAll(){
		return this.representantRepo.findAll();
	}
	
	@GetMapping("/representants/{id}")
	@ApiOperation(value="Permet de recupérer un représentant via son identifiant.")
	public Optional<Representant> get(@PathVariable Long id){
		return this.representantRepo.findById(id);
	}
	
	@PostMapping("/representants")
	@ApiOperation(value="Permet d'ajouter un représentant.")
	public void add(@RequestBody Representant representant) {
		this.representantRepo.save(representant);
	}
	
	@PutMapping("/representants")
	@ApiOperation(value="Permet de mettre à jour un représentant.")
	public void update(@RequestBody Representant representant) {
		this.representantRepo.save(representant);
	}
	
	@DeleteMapping("/representants")
	@ApiOperation(value="Permet de supprimer un représentant.")
	public void remove(@RequestBody Representant representant) {
		this.representantRepo.delete(representant);
	}
	
	@DeleteMapping("/representants/{id}")
	@ApiOperation(value="Permet de supprimer un représentant.")
	public void removeById(@PathVariable Long id) {
		this.representantRepo.deleteById(id);
	}

}
