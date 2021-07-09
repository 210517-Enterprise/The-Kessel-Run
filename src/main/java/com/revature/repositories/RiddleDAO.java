package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Riddle;


public interface RiddleDAO extends JpaRepository<Riddle, Integer> {
	
	public Riddle findByRiddle(String riddle);

}
