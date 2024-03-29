package com.revature;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Random;

import com.revature.model.User;
import com.revature.repositories.UserDAO;
import com.revature.service.UserService;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest {
	
	private UserService userv;
	
	@Autowired
	private UserDAO mockdao;

	private User user = new User(), expectedUser = new User();
	
//	private Planet planet = new Planet("Jupiter", new HashSet<>(), new HashSet<>());
	
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
		user.setPass("FunnyBunny");
		
//		expectedUser.setListCrewMate(new ArrayList<String>());
		expectedUser.setId(0);
		expectedUser.setName("John Collens");
		expectedUser.setUsername("john");
		expectedUser.setPass("FunnyBunny");

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

}
