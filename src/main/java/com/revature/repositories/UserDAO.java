package com.revature.repositories;

import java.util.List;

import com.revature.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Integer>{

	// Since we are inheriting all methods from JPARepository, we already have save(), get()...etc...
	@Query //<===== added query annotations for this method
	public User findByUsername(String username);
	// eventually venture into Optional.ofNullable
	
	@Query // find by CHARACTER'S name
	public List<User> findByName(String name);
	
	@Query
	public List<User> findByRace(String race);
	
	@Query
	public List<User> findByHairColor(String hairColor);
	
	@Query
	public List<User> findByEyeColor(String eyeColor);
	
	@Query
	public List<User> findByStarship(String starship);
	
	@Query
	public List<User> findByModel(String model);
	
	@Query
	public List<User> findByCopilot(String copilot);
	
	@Query
	public List<User> findByPlanet(String planet);
	
}
