package com.jwt.exmple.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.exmple.model.User;
import com.jwt.exmple.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getUser() {
		System.out.println("gettting users");
		return this.userService.getUsers();
		
	}
	
	@GetMapping("/current-user")
	public String getLoggedInUser(Principal principal) {
		return principal.getName();
		
	}
}
