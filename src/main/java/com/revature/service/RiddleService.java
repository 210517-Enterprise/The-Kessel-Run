package com.revature.service;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.exceptions.RiddleNotFoundException;
import com.revature.model.Riddle;
import com.revature.repositories.RiddleDAO;

import lombok.Getter;
import lombok.Setter;

@Service @Setter @Getter
public class RiddleService {

	@Autowired
	private RiddleDAO riddleDAO;
	
	/*
	 * return a Set<Riddle>
	 */
	public Set<Riddle> findAll() {
		return getRiddleDAO().findAll().stream().collect(Collectors.toSet());
	}

	/*
	 * return Riddle
	 * 
	 * param riddle
	 */
	public Riddle findByRiddle(String riddle) {
		Riddle r = getRiddleDAO().findByRiddle(riddle);

		if (r == null) {
			new RiddleNotFoundException("No riddle found with for '" + riddle+"'");
		}

		return r;
	}

	/*
	 * return Riddle
	 * 
	 * param id
	 */
	public Riddle findById(int id) {

		return getRiddleDAO().findById(id).orElseThrow(() -> new RiddleNotFoundException("No riddle found with id " + id));

	}

	/*
	 * return Riddle
	 * 
	 * param Riddle to persist to the database
	 */
	public Riddle insert(Riddle r) {
		return getRiddleDAO().save(r);
	}
	
	/*
	 * param Riddle to persist to the database
	 */
	public void delete(Riddle r) {
		 getRiddleDAO().delete(r);
	}
	
	
	
}
