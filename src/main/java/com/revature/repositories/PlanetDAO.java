package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.model.Planet;

@Repository
public interface PlanetDAO extends JpaRepository<Planet, String> {
	
	/*
	 * Updates are saved automatically by the JPA Repository when you update an object attached to a session
	 * when that session is flushed. We do NOT need to write update methods for each field.
	 */

}
