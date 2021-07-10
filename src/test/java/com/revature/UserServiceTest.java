package com.revature;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.exceptions.FailedToRegisterUserException;
import com.revature.exceptions.PlanetNotFoundException;
import com.revature.exceptions.StarshipNotFoundException;
import com.revature.exceptions.UserNotFoundException;
import com.revature.model.Planet;
import com.revature.model.User;
import com.revature.repositories.UserDAO;
import com.revature.service.UserService;

public class UserServiceTest {
	
	private UserService userv;
	
	@Autowired
	private UserDAO mockdao;

	private User user = new User(), expectedUser = new User();
	
	private Planet planet = new Planet("Jupiter", new HashSet<>(), new HashSet<>());
	
	private String starship = "The Flying Chicken";
	
	private String model = "Executor-class star dreadnought";

	@BeforeEach
	public void setup() {
		userv = new UserService();
		mockdao = mock(UserDAO.class);
		
		userv.setUserDAO(mockdao); 

//		user.setListCrewMate(new ArrayList<String>());
		user.setId(0);
		user.setName("John Collens");
		user.setUsername("john");
		user.setPassword("FunnyBunny");
		
//		expectedUser.setListCrewMate(new ArrayList<String>());
		expectedUser.setId(0);
		expectedUser.setName("John Collens");
		expectedUser.setUsername("john");
		expectedUser.setPassword("FunnyBunny");

	}

	@AfterEach
	public void teardown() {
		userv = null;
		user = null;
		expectedUser=null;
	}

	@Test
	public void testRegisterUser_returnsNewPk() {
		
		Random rand = new Random();
		int fakePk = rand.nextInt(100);
		expectedUser.setId(fakePk);
		
		when(mockdao.save(user)).thenReturn(expectedUser);
		
		User registeredUser = userv.register(user);

		assertEquals(registeredUser.getId(), fakePk);

	}
	

	@Test
	public void testRegisterUser_idGreaterThanZero_throwsException() {
		
		user.setId(34);
		
		assertThrows(FailedToRegisterUserException.class, () -> 
		userv.register(user), "Received User Object did not have ID of 0");
			
	}
	
	@Test
	public void testLoginUser_returnsUser() {
		
		when(mockdao.findByUsername(user.getUsername())).thenReturn(expectedUser);
		
		User loggedinUser = userv.login(user.getUsername(),user.getPassword());

		assertEquals(loggedinUser, expectedUser);

	}
	
	@Test
	public void testLoginUser_noPasswordandnoUsername_throwsUserNotFoundException() {
		
		assertThrows(UserNotFoundException.class, () -> 
		userv.login("", ""), "No User was found");
			
	}
	
	@Test
	public void testChangePlanet_returnsUserWithUpdatedPlanet() {
		
		expectedUser.setPlanet(planet);
		when(mockdao.updatePlanet(user, planet)).thenReturn(expectedUser);
		
	    User updatedUser = userv.changePlanet(user,planet);

		assertEquals(updatedUser, expectedUser);

	}
	
	@Test
	public void testChangePlanet_nullUser_throwsUserNotFoundException() {
		
		assertThrows(UserNotFoundException.class, () -> 
		userv.changePlanet(null, planet), "No User was found");
			
	}
	
	@Test
	public void testChangePlanet_nullPlanet_throwsPlanetNotFoundException() {
		
		assertThrows(PlanetNotFoundException.class, () -> 
		userv.changePlanet(user, null), "No Planet was found");
			
	}
	
	@Test
	public void testChangeStarship_returnsUserWithUpdatedStarship() {
		
		expectedUser.setStarship(starship);;
		when(mockdao.updateStarship(user, starship)).thenReturn(expectedUser);
		
	    User updatedUser = userv.changeStarship(user,starship);

		assertEquals(updatedUser, expectedUser);

	}
	
	@Test
	public void testChangeStarship_nullUser_throwsUserNotFoundException() {
		
		assertThrows(UserNotFoundException.class, () -> 
		userv.changeStarship(null, starship), "No User was found");
			
	}
	
	@Test
	public void testChangeStarship_nullStarship_throwsStarshipNotFoundException() {
		
		assertThrows(StarshipNotFoundException.class, () -> 
		userv.changeStarship(user, null), "No Planet was found");
			
	}
	

}
