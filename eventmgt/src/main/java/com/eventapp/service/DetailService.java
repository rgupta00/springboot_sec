package com.eventapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eventapp.entities.User;
@Transactional
@Service
public class DetailService implements UserDetailsService{

	private UserService userService;
	
	@Autowired
	public DetailService(UserService userService) {
		this.userService = userService;
	}
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//i need to convert my User to spring sec user
		
		User user=userService.findByUsername(username);
		if(user==null)
			throw new UsernameNotFoundException("user not found");
		
		org.springframework.security.core.userdetails.User secUser=
		new org.springframework.security.core.userdetails.User(user.getUsername(), 
		user.getPassword(), AuthorityUtils.createAuthorityList(new String[] {user.getRoles()}));
		
		return secUser;
	}

}








