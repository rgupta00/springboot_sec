package com.bookapp.service;

import com.bookapp.repo.User;

public interface UserService {
	public User findByName(String name);
	public void addUser(User user);
	
}
