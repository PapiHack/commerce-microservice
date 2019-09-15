package com.commerce.microservice.controllers;

import static org.junit.Assert.assertFalse;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.commerce.microservice.beans.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
	
	@Autowired
	private UserController userController;
	
	@Test
	public void getUserNotExist() {
		Optional<User> user = this.userController.get(100L);
		assertFalse(user.isPresent());
	}

}
