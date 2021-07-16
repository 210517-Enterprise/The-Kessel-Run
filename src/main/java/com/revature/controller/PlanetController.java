package com.revature.controller;

import java.util.List;

import com.revature.model.Riddle;
import com.revature.model.User;
import com.revature.service.RiddleService;
import com.revature.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/planets") // we can access the methods of this controller at http://localhost:8080/planets
public class PlanetController { 

  @Autowired
  RiddleService riddleService;

  @Autowired
  UserService userService;

  @GetMapping("/{planet}") // This passes all riddles
  public ResponseEntity<List<Riddle>> get(@PathVariable("planet") String planet) {
    planet = planet.replace('_', ' ');
    return ResponseEntity.ok(riddleService.findByPlanet(planet));
  }
  
  	// Getmapping for the planet page, findUsersByPlanet()
	@GetMapping("/{planet}/users")
  public ResponseEntity<List<User>> findByPlanet(@PathVariable("planet") String planet) {
    planet = planet.replace('_', ' ');
    return ResponseEntity.ok(userService.findByPlanet(planet));
  }
}
