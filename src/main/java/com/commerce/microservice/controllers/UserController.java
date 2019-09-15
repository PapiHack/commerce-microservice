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

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/users")
	public List<User> getAll(){
		return this.userRepo.findAll();
	}
	 
	 @GetMapping("/users/{id}")
	 public Optional<User> get(@PathVariable Long id) {
		 return this.userRepo.findById(id);
	 }
	 
	 @PostMapping("/users")
	 public void add(@RequestBody User user) {
		 this.userRepo.save(user);
	 }
	 
	 @PutMapping("/users")
	 public void update(@RequestBody User user) {
		 this.userRepo.save(user);
	 }
	 
	 @DeleteMapping("/users")
	 public void remove(@RequestBody User user) {
		 this.userRepo.delete(user);
	 }
	 
	 @DeleteMapping("/users/{id}")
	 public void removeById(@PathVariable Long id) {
		 this.userRepo.deleteById(id);
	 }

}
