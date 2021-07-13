package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.model.Planet;
import com.revature.model.User;

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
	public List<User> findByPlanet(Planet planet);
	
	
	//Allows to sort by a sort object. Useful in a bounty list for example. modular so we don't need multiple sorting queries
//	@Query
//	public List<User> findAll();

	/*
	 * Updates are saved automatically by the JPA Repository when you update an object attached to a session
	 * We do NOT need to write update methods for each field.
	 * Might be UNCESSARY METHODS. I know this would kill the junit tests. but we only need to test the functions that we write. like custom queries
	 * |||||||||||||||
	 * |||||||||||||||
	 * |||||||||||||||
	 * VVVVVVVVVVVVVVV
	 */
	
//	public User updatePlanet(User u, Planet planet);
//	
//	public User updateStarship(User u, String starship);
//	
//	public User updateModel(User u, String model);
//	
//	public User updateCredits(User u, int credits);
//	
//	public User updateCopilot(User u, String copilot);
	
}
