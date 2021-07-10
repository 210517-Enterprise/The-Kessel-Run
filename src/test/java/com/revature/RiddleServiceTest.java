package com.revature;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Random;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.exceptions.FailedToRegisterRiddleException;
import com.revature.model.Riddle;
import com.revature.repositories.RiddleDAO;
import com.revature.service.RiddleService;

public class RiddleServiceTest {

private RiddleService rserv;
	
	@Autowired
	private RiddleDAO mockdao;

	private Riddle riddle = new Riddle(), expectedRiddle = new Riddle();

	@BeforeEach
	public void setup() {
		rserv = new RiddleService();
		mockdao = mock(RiddleDAO.class);
		
		rserv.setRiddleDAO(mockdao); 

		riddle.setId(0);
		riddle.setRiddle("What Language is this coded in?");
		riddle.setAnswer("Java");
		
		expectedRiddle.setId(0);
		expectedRiddle.setRiddle("What Language is this coded in?");
		expectedRiddle.setAnswer("Java");
		
	}

	@AfterEach
	public void teardown() {
		rserv = null;
		riddle = null;
		expectedRiddle=null;
	}

	@Test
	public void testRegisterRiddle_returnsNewPk() {
		
		Random rand = new Random();
		int fakePk = rand.nextInt(100);
		expectedRiddle.setId(fakePk);
		
		when(mockdao.save(riddle)).thenReturn(expectedRiddle);
		
		Riddle registeredRiddle = rserv.register(riddle);

		assertEquals(registeredRiddle.getId(), fakePk);

	}
	
	@Test
	public void testRegisterRiddle_idGreaterThanZero_throwsException() {
		
		riddle.setId(1);
		
		assertThrows(FailedToRegisterRiddleException.class, () -> 
		rserv.register(riddle), "Received Riddle Object did not have ID of 0");
			
	}
	
}
