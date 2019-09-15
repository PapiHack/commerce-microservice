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

import com.commerce.microservice.repositories.ClientRepository;

import ch.qos.logback.core.net.server.Client;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description="API REST")
public class ClientController {
	
	@Autowired
	private ClientRepository clientRepo;
	
	@GetMapping("/clients")
	@ApiOperation(value="Permet de recupérer tous les clients.")
	public List<Client> getAll(){
		return this.clientRepo.findAll();
	}
	
	@GetMapping("/clients/{id}")
	public Optional<Client> get(@PathVariable Long id){
		return this.clientRepo.findById(id);
	}
	
	@PostMapping("/clients")
	public void add(@RequestBody Client client) {
		this.clientRepo.save(client);
	}
	
	@PutMapping("/clients")
	public void update(@RequestBody Client client) {
		this.clientRepo.save(client);
	}
	
	@DeleteMapping("/clients")
	public void remove(@RequestBody Client client) {
		this.clientRepo.delete(client);
	}
	
	@DeleteMapping("/clients/{id}")
	public void removeById(@PathVariable Long id) {
		this.clientRepo.deleteById(id);
	}

}
