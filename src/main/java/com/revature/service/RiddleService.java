package com.revature.service;

import java.util.List;

import com.revature.exceptions.RiddleNotFoundException;
import com.revature.model.Riddle;
import com.revature.repositories.RiddleDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import lombok.Getter;
import lombok.Setter;

@Service @Setter @Getter
public class RiddleService {

	@Autowired
	private RiddleDAO riddleDAO;
	
	/*
	 * return a List<Riddle>
	 */
	@Transactional(readOnly = true)
	public List<Riddle> findAll() {
		return riddleDAO.findAll();
	}

	/*
	 * return Riddle
	 * 
	 * param riddle
	 */
	@Transactional(readOnly = true)
	public Riddle findByRiddle(String riddle) {
		Riddle r = riddleDAO.findByRiddle(riddle);

		if (r == null) {
			new RiddleNotFoundException("No riddle found with for \'" + riddle+"\'");
		}

		return r;
	}

	/*
	 * return Riddle
	 * 
	 * param id
	 */
	@Transactional(readOnly = true)
	public Riddle findById(int id) {

		return riddleDAO.findById(id).orElseThrow(() -> new RiddleNotFoundException("No riddle found with id " + id));

	}

  	/*
	 * return Riddle
	 * 
	 * param id
	 */
	@Transactional(readOnly = true)
	public List<Riddle> findByPlanet(String planet) {

		return riddleDAO.findByPlanet(planet);

	}

	/*
	 * return Riddle
	 * 
	 * param Riddle to persist to the database
	 */
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Riddle insert(Riddle r) {
		return riddleDAO.save(r);
	}
	
	/*
	 * param Riddle to persist to the database
	 */
  @Transactional
	public void delete(Riddle r) {
    riddleDAO.delete(r);
	}
	
}
