package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.User;

@Repository
public interface UserDAO extends JpaRepository<User, Integer>{

	// Since we are inheriting all methods from JPARepository, we already have save(), get()...etc...
	public User findByUsername(String username);
	// eventually venture into Optional.ofNullable
	
}
