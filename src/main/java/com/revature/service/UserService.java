package com.revature.service;

import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.exceptions.FailedToRegisterUserException;
import com.revature.exceptions.LoginUserFailureException;
import com.revature.exceptions.PlanetNotFoundException;
import com.revature.exceptions.StarshipNotFoundException;
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
	
	@Autowired
	private EntityManager em;
	

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
	 * param User to persist to the database
	 */
	public void delete(User u) {
		 getUserDAO().delete(u);
	}
	
	/*
	 * return User 
	 * 
	 * param User and Planet
	 */
	public User updatePlanet(User u, Planet planet) {
		
		Query q = em.createNamedQuery("User.updatePlanet");
		q.setParameter(1, planet);
		q.setParameter(2, u.getId());
		
		q.executeUpdate();
		
		User result =findById(u.getId());
		
		return result;
	}
	
	/*
	 * return User 
	 * 
	 * param User and Starship
	 */
	public User updateStarship(User u, String s) {
		
		Query q = em.createNamedQuery("User.updatePlanet");
		q.setParameter(1, s);
		q.setParameter(2, u.getId());
		
		q.executeUpdate();
		
		User result =findById(u.getId());
		
		return result;
	}
	
	/*
	 * return User 
	 * 
	 * param User and credit to add or minus
	 */
	public User updateCredits(User u, int credits) {
		
		Query q = em.createNamedQuery("User.updateCredits");
		q.setParameter(1, u.getCredits());
		q.setParameter(2, credits);
		q.setParameter(3, u.getId());
		
		q.executeUpdate();
		
		User result =findById(u.getId());
		
		return result;
	}
	

	/*
	 * End of the building block methods
	 */

	/*
	 * return User
	 * 
	 * param User with id=0 
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
	
	/*
	 * return User
	 * 
	 * param username and password
	 */
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
			
			if(p != null) {
			
				User result = userDAO.updatePlanet(u, p);
				
				return result;
				
			} else {
				throw new PlanetNotFoundException("No Planet was found");
			}
			
		} else {
			throw new UserNotFoundException("No User was found");
		}
	}

	/*
	 * return User
	 * 
	 * param User, Starship
	 */
	public User changeStarship(User u, String s) {

		if (u != null) {
			
			if(s != null) {
			
				User result = userDAO.updateStarship(u, s);
				
				return result;
				
			} else {
				throw new StarshipNotFoundException("No Starship was found");
			}
			
		} else {
			throw new UserNotFoundException("No User was found");
		}
	}

}
