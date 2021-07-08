package com.revature.repositories;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.model.Planet;
import com.revature.model.User;

@Repository
public interface UserDAO extends JpaRepository<User, Integer>{

	// Since we are inheriting all methods from JPARepository, we already have save(), get()...etc...
	@Query("SELECT u FROM Users WHERE u.username = ?1")
	public User findByUsername(String username);
	// eventually venture into Optional.ofNullable
	
	
	//finds all users by the sort passed in. for example pass in "username" to sort by username
	@Query("SELECT u FROM Users U")
	public List<User> findAllUsersSortedBy(Sort sort);
	
	@Query("SELECT u FROM Users WHERE u.planet = ?1")
	public User findByPlanet(Planet planet);
	
	@Query("UPDATE User SET bounty = bounty + ?1 WHERE c.id = ?2")
	public 

}
