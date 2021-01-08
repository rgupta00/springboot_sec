package com.bookapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AppUserRepo extends JpaRepository<AppUser,Integer >{
	AppUser findByUserName(String userName);
}
