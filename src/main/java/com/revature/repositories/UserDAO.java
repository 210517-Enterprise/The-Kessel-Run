package com.revature.repositories;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.revature.model.Planet;
import com.revature.model.Starship;
import com.revature.model.User;

@Repository
public interface UserDAO extends JpaRepository<User, Integer>{

	//------------------------------------------------------CREATE FUNCTIONS-------------------------------------------------------------------
	
	
	
	//--------------------------------------------------END OF CREATE FUNCTIONS---------------------------------------------------------------
	
	//-----------------------------------------------------READ FUNCTIONS---------------------------------------------------------------------
	
	
	// Since we are inheriting all methods from JPARepository, we already have save(), get()...etc...
	@Query("SELECT u FROM Users WHERE u.username = ?1")
	public User findByUsername(String username);
	// eventually venture into Optional.ofNullable
	
	//find user by username and password for login service method
	@Query("SELECT u FROM Users WHERE u.username = ?1 AND u.password = ?2")
	public User findByUsernameAndPassword(String username, String password);
	
	
	//finds all users by the sort passed in. for example pass in "username" to sort by username. used for 'bounty board' functionality
	@Query("SELECT u FROM Users U")
	public List<User> findAllUsersSortedBy(Sort sort);
	
	
	//find users on a certain planet
	@Query("SELECT u FROM Users WHERE u.planet = ?1")
	public List<User> findByPlanet(Planet planet);
	
	//----------------------------------------------------------END OF READ FUNCTIONS------------------------------------------------------------
	
	
	//------------------------------------------------------------UPDATE FUNCTIONS-------------------------------------------------------------
	
	
	
	//increase bounty of a user
	@Query("UPDATE User SET bounty = bounty + ?1 WHERE u.id = ?2")
	public void increaseBounty(int bounty, int id);
	
	
	//remove bounty for 'claimBounty' service method
	@Query("UPDATE User SET bounty = 0 WHERE u.id = ?1")
	public void removeBounty(int id);
	
	
	//increase credits for 'claimBounty' and general gain credits functionality
	@Query("UPDATE User SET credits = credits + ?1 WHERE u.id = ?2")
	public void increaseCredits(int credits, int id);
	
	
	//decrease user credits for posting bounties or purchasing starships
	@Query("UPDATE User SET credits = credits - ?1 WHERE u.id = ?2")
	public void decreaseCredits(int credits, int id);
	

	
	//-------------------------------------------------END OF UPDATE FUNCTIONS------------------------------------------------------------
	
	//-----------------------------------------------------DELETE FUNCTIONS---------------------------------------------------------------
	
	@Query("DELETE FROM Users WHERE u.id = ?1")
	public void deleteUser(int id);
	
	
	//-----------------------------------------------------END OF DELETE FUNCTIONS-------------------------------------------------------
}
