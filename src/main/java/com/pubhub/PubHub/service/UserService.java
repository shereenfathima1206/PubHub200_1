package com.pubhub.PubHub.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;


import com.pubhub.PubHub.model.User;
import com.pubhub.PubHub.repository.UserRepository;

@Service

public class UserService {
	
	@Autowired
	private UserRepository userRepo;



	public String save(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("password") String password) throws Exception {
		User user = new User();
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		System.out.println("New User Detail  " + user);
		userRepo.save(user);

		return "new";
	}

}
