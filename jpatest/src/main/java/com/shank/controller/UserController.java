package com.shank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shank.model.User;
import com.shank.service.UserService;

@RestController
@RequestMapping("/datajpa")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/getalluser")
	public List<User> getAllUsers() {
		return service.getUsers();

	}

}
