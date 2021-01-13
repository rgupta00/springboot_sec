package com.eventapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eventapp.dao.UserRepo;
import com.eventapp.entities.User;
@Service
@Transactional
public class UserServiceImpl implements UserService{

	private UserRepo userRepo;

	@Autowired
	public UserServiceImpl(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public void addUser(User user) {
		userRepo.save(user);
		System.out.println("called");
	}

	@Override
	public User findByUsername(String username) {
		return userRepo.findByUsername(username);
	}
}


