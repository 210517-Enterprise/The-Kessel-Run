package com.revature.repositories;

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
	public User findByName(String name);
	
	/*
	 * Updates are saved automatically by the JPA Repository when you update an object attached to a session
	 * We do NOT need to write update methods for each field.
	 * UNCESSARY METHODS. I know this would will the junit test. but we only need to test the functions that we write. like custom queries
	 * |||||||||||||||
	 * |||||||||||||||
	 * |||||||||||||||
	 * VVVVVVVVVVVVVVV
	 */
	
	public User updatePlanet(User u, Planet planet);
	
	public User updateStarship(User u, String starship);
	
	public User updateModel(User u, String model);
	
	public User updateCredits(User u, int credits);
	
	public User updateCopilot(User u, String copilot);
	
}
