package com.shank.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shank.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public List<User> findByProfession(String profession);
	
	
}
