package com.bookapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookapp.repo.User;
import com.bookapp.repo.UserRepo;
@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User findByName(String name) {
		return userRepo.findByName(name);
	}

	@Override
	public void addUser(User user) {
		userRepo.save(user);
	}

}