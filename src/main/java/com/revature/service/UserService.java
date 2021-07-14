package com.revature.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.revature.exceptions.FailedToRegisterUserException;
import com.revature.exceptions.LoginUserFailureException;
import com.revature.exceptions.UserNotFoundException;
import com.revature.model.User;
import com.revature.repositories.UserDAO;

import lombok.Getter;
import lombok.Setter;

@Service @Setter @Getter
public class UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private EntityManager em;
	

	/*
	 * return a Set<User>
	 */
	@Transactional(readOnly = true)
	public List<User> findAll() {
		return userDAO.findAll().stream().collect(Collectors.toList());
	}

	/*
	 * return User
	 * 
	 * param username
	 */
	@Transactional(readOnly = true)
	public User findByUsername(String username) {
		User u = userDAO.findByUsername(username);

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
	@Transactional(readOnly = true)
	public User findById(int id) {

		return userDAO.findById(id).orElseThrow(() -> new UserNotFoundException("No user found with id " + id));

	}

	/*
	 * return User
	 * 
	 * param User to persist to the database
	 */
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public User insert(User u) {
		u.setBounty(0);
		u.setCredits(0);
		u.setModel("YT-1300 light freighter");
		u.setPlanet("Tatooine");
		return userDAO.save(u);
	}
	
	/*
	 * param User to persist to the database
	 */
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void delete(User u) {
		 userDAO.delete(u);
	}
	

	/*
	 * End of the building block methods
	 */

	/*
	 * return User
	 * 
	 * param User with id=0 
	 */
	@Transactional(propagation = Propagation.REQUIRES_NEW)
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
	
	/*
	 * return User
	 * 
	 * param username and password
	 */
	@Transactional(readOnly = true)
	public User login(String username, String password) {

		User u = (User) userDAO.findByUsername(username);

		if (u != null) {
			if (u.getPass().equals(password)) {
				return u;
			} else {
				throw new LoginUserFailureException("The password or username you enter did not match!");
			}
		} else {
			throw new LoginUserFailureException("The password or username you enter did not match!");
		}

	}

  @Transactional(readOnly = true)
  public List<User> findByPlanet(String planet) {
    return userDAO.findByPlanet(planet);
  }

}
