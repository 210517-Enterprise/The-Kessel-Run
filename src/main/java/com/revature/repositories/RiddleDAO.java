package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.model.Riddle;


public interface RiddleDAO extends JpaRepository<Riddle, Integer> {
	@Query //<===== added query annotations for this method
	public Riddle findByRiddle(String riddle);
	
	/*
	 * Updates are saved automatically by the JPA Repository when you update an object attached to a session
	 * We do NOT need to write update methods for each field.
	 */

}
