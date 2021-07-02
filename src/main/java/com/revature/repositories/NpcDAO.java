package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.NPC;


public interface NpcDAO extends JpaRepository<NPC, Integer> {
	
	

}
