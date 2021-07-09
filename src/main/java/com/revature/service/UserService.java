package com.revature.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.exceptions.FailedToRegisterUserException;
import com.revature.exceptions.LoginUserFailureException;
import com.revature.exceptions.UserNotFoundException;
import com.revature.model.Planet;
import com.revature.model.User;
import com.revature.repositories.UserDAO;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;

	public Set<User> findAll() {
		return userDAO.findAll().stream().collect(Collectors.toSet());
	}

	public User findByUsername(String username) {
		User u = userDAO.findByUsername(username);

		if (u == null) {
			new UserNotFoundException("No user found with username " + username);
		}

		return u;
	}

	public User findById(int id) {

		return userDAO.findById(id).orElseThrow(() -> new UserNotFoundException("No user found with id " + id)); // let's
																													// create
																													// a
																													// custom
																													// user
																													// not
																													// found
																													// exception

	}

	public User insert(User u) {
		return userDAO.save(u);
	}

	public User register(User u) {

		if (u.getId() != 0) {
			throw new FailedToRegisterUserException("Received User Object did not have ID of 0");
		}

		User persistedUser = userDAO.save(u);

		int generatedId = persistedUser.getId();

		if (generatedId != -1 && generatedId != u.getId()) {
			u.setId(generatedId);
		} else {
			throw new FailedToRegisterUserException("Failed to insert the User record");
		}

		return u;
	}

	public User login(String username, String password) {

		User u = (User) userDAO.findByUsername(username);

		if (u != null) {
			if (u.getPassword().equals(password)) {
				return u;
			}else {
			throw new LoginUserFailureException("The password or username you enter did not match!");
			}
		}else {
			throw new UserNotFoundException("No User was found");
		}
			
	}
	
	//returns a list of users from highest to lowest bounty
	public List<User> bountyList() {
		
		List<User> bountyList = userDAO.findAll(Sort.by(Sort.Direction.DESC, "bounty"));
		
		return bountyList;
	}
	
	public List<User> usersOnPlanet(Planet planet) {
		List<User> list = userDAO.findByPlanet(planet);
		return list;
	}
	
	//removes a bounty from one user and adds the credits to another
	@Transactional
	public void claimBounty(User claimer, User captured) {
		userDAO.increaseCredits(captured.getBounty(), claimer.getId());
		userDAO.removeBounty(captured.getId());
	}

}
