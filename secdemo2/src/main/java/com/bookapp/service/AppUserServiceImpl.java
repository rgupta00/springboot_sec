package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookapp.repo.AppUser;
import com.bookapp.repo.AppUserRepo;
@Service
@Transactional
public class AppUserServiceImpl implements AppUserService{

	@Autowired
	private AppUserRepo appUserRepo;
	
	@Override
	public AppUser findByUserName(String userName) {
		return appUserRepo.findByUserName(userName);
	}

	@Override
	public void addUser(AppUser appUser) {
		appUserRepo.save(appUser);
	}

	@Override
	public List<AppUser> getAllAppUsers() {
		return appUserRepo.findAll();
	}

}
