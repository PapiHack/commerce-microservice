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

@RestController
public class ReglementController {
	
	@Autowired
	private ReglementRepository reglementRepo;
	
	@GetMapping("/reglements")
	public List<Reglement> getAll(){
		return this.reglementRepo.findAll();
	}
	
	@GetMapping("/reglements/{id}")
	public Optional<Reglement> get(@PathVariable Long id){
		return this.reglementRepo.findById(id);
	}
	
	@PostMapping("/reglements")
	public void add(@RequestBody Reglement reglement) {
		this.reglementRepo.save(reglement);
	}
	
	@PutMapping("/reglements")
	public void update(@RequestBody Reglement reglement) {
		this.reglementRepo.save(reglement);
	}
	
	@DeleteMapping("/reglements")
	public void remove(@RequestBody Reglement reglement) {
		this.reglementRepo.delete(reglement);
	}
	
	@DeleteMapping("/reglements/{id}")
	public void removeById(@PathVariable Long id) {
		this.reglementRepo.deleteById(id);
	}

}
