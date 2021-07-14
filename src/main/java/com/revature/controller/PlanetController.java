package com.revature.controller;

import com.revature.model.Planet;
import com.revature.service.PlanetSerice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/planets")
public class PlanetController {

  @Autowired
  PlanetSerice planetSerice;

  @GetMapping("/{planet}") // This passes all riddles
  public ResponseEntity<Planet> get(@PathVariable("planet") String planet) {
    planet = planet.replace('_', ' ');
    return ResponseEntity.ok(planetSerice.getPlanet(planet));
  }
  
}
