package com.pubhub.PubHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pubhub.PubHub.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	
	public User findByEmailAndPassword(String email,String password);
	
	
	
}
