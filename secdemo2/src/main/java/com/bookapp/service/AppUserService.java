package com.bookapp.service;
import java.util.*;
import com.bookapp.repo.AppUser;

public interface AppUserService {
	public AppUser findByUserName(String userName);
	public void addUser(AppUser appUser);
	public List<AppUser>getAllAppUsers();
}
