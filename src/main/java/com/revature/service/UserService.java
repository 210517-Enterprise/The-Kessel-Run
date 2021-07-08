package com.revature.service;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.exceptions.FailedToRegisterUserException;
import com.revature.exceptions.LoginUserFailureException;
import com.revature.exceptions.UserNotFoundException;
import com.revature.model.Planet;
import com.revature.model.User;
import com.revature.repositories.UserDAO;

import lombok.Getter;
import lombok.Setter;

@Service @Setter @Getter
public class UserService {
	
	@Autowired
	private UserDAO userDAO;
	

	/*
	 * return a Set<User>
	 */
	public Set<User> findAll() {
		return getUserDAO().findAll().stream().collect(Collectors.toSet());
	}

	/*
	 * return User
	 * 
	 * param username
	 */
	public User findByUsername(String username) {
		User u = getUserDAO().findByUsername(username);

		if (u == null) {
			new UserNotFoundException("No user found with username " + username);
		}

		return u;
	}

	/*
	 * return User
	 * 
	 * param id
	 */
	public User findById(int id) {

		return getUserDAO().findById(id).orElseThrow(() -> new UserNotFoundException("No user found with id " + id));

	}

	/*
	 * return User
	 * 
	 * param User to persist to the database
	 */
	public User insert(User u) {
		return getUserDAO().save(u);
	}

	/*
	 * End of the building block methods
	 */

	public User register(User u) {

		if (u.getId() != 0) {
			throw new FailedToRegisterUserException("Received User Object did not have ID of 0");
		}

		User persistedUser = insert(u);

		int generatedId = persistedUser.getId();

		if (generatedId != -1 && generatedId != u.getId()) {
			u.setId(generatedId);
		} else {
			throw new FailedToRegisterUserException("Failed to insert the User record");
		}

		return u;
	}

	public User login(String username, String password) {

		User u = (User) getUserDAO().findByUsername(username);

		if (u != null) {
			if (u.getPassword().equals(password)) {
				return u;
			} else {
				throw new LoginUserFailureException("The password or username you enter did not match!");
			}
		} else {
			throw new UserNotFoundException("No User was found");
		}

	}

	/*
	 * return User
	 * 
	 * param User, Planet
	 */
	public User changePlanet(User u, Planet p) {
		
		if (u != null) {
	
//			userDAO.updatePlanet(u, p);
			
			return null;
			
			
			
		} else {
			throw new UserNotFoundException("No User was found");
		}
	}

	/*
	 * return User
	 * 
	 * param User, Starship
	 */
	public User changeStarship(User u) {

		return null;
	}
	
	/*
	 * return User
	 * 
	 * param User, Planet
	 */
	public User addCredits(User u, int credit ) {

		return null;
	}
	
	/*
	 * return User
	 * 
	 * param User, Planet
	 */
	public User minusCredits(User u, int credit ) {

		return null;
	}

}
