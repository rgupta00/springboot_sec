package com.bookapp.repo;

import java.util.*;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appuser_table")
public class AppUser {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String userName;
	private String password;
	
	@Column(name="role")
	@CollectionTable(name="appuser_roles")
	@ElementCollection(fetch = FetchType.EAGER)
	private List<String> roles=new ArrayList<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public AppUser(String userName, String password, List<String> roles) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "AppUser [id=" + id + ", userName=" + userName + ", password=" + password + ", roles=" + roles + "]";
	}

	public AppUser() {}
	
	
	
}
