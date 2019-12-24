package com.shank.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shank.dao.UserRepository;
import com.shank.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	@PostConstruct
	public void initDB() {
		List<User> user = new ArrayList<User>();
		user.add(new User(101, "shankar", 21, "pat", "chennai"));
		user.add(new User(102, "Gokul", 21, "pat", "chennai"));
		user.add(new User(103, "Giri", 22, "pat", "chennai"));
		repository.saveAll(user);
	}

	public List<User> getUsers() {
		return repository.findAll();

	}
	public List<User> getUserByProfession(String profession)
	{
		return repository.findByProfession(profession);
		
	}

}
