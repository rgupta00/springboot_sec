package com.bookapp.config;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.memory.UserAttributeEditor;
import org.springframework.stereotype.Service;

import com.bookapp.repo.AppUser;
import com.bookapp.service.AppUserService;
@Service
public class DetailService implements UserDetailsService{

	@Autowired
	private AppUserService appUserService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AppUser appUser=appUserService.findByUserName(username);
		System.out.println(appUser);
		if(appUser==null)
			throw new UsernameNotFoundException("user with name :"+ username +" is not found");
		//I need to convert my appuser to spring sec user
	
		//i need to convert ArraryList to String[]
		
		String[] roles=new String[appUser.getRoles().size()];
		appUser.getRoles().toArray(roles);
		
		System.out.println(roles);
		User user=new User(appUser.getUserName(), appUser.getPassword(),
				AuthorityUtils.createAuthorityList(roles));
		
		return user;
	}

}









