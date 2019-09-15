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

import com.commerce.microservice.beans.User;
import com.commerce.microservice.repositories.UserRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description="CRUD sur les users")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/users")
	@ApiOperation(value="Permet de recupérer tous les users.")
	public List<User> getAll(){
		return this.userRepo.findAll();
	}
	 
	 @GetMapping("/users/{id}")
		@ApiOperation(value="Permet de recupérer un user via son identifiant.")
	 public Optional<User> get(@PathVariable Long id) {
		 return this.userRepo.findById(id);
	 }
	 
	 @PostMapping("/users")
		@ApiOperation(value="Permet d'ajouter un user.")
	 public void add(@RequestBody User user) {
		 this.userRepo.save(user);
	 }
	 
	 @PutMapping("/users")
		@ApiOperation(value="Permet de mettre à jour un user.")
	 public void update(@RequestBody User user) {
		 this.userRepo.save(user);
	 }
	 
	 @DeleteMapping("/users")
		@ApiOperation(value="Permet de supprimer un user.")
	 public void remove(@RequestBody User user) {
		 this.userRepo.delete(user);
	 }
	 
	 @DeleteMapping("/users/{id}")
		@ApiOperation(value="Permet de supprimer un user via son identifiant.")
	 public void removeById(@PathVariable Long id) {
		 this.userRepo.deleteById(id);
	 }

}
