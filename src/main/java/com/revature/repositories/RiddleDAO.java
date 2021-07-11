package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.model.Riddle;

@Repository
public interface RiddleDAO extends JpaRepository<Riddle, Integer> {
	@Query //<===== added query annotations for this method
	public Riddle findByRiddle(String riddle);
	
	@Query
	public Riddle findByAnswer(String answer);
	/*
	 * Updates are saved automatically by the JPA Repository when you update an object attached to a session
	 * We do NOT need to write update methods for each field.
	 */

}
