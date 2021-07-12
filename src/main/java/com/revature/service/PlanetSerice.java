package com.revature.service;

import com.revature.model.Planet;
import com.revature.repositories.PlanetDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlanetSerice {

  @Autowired
  private PlanetDAO planetDAO;

  /**
   * return a Planet
   */
  @Transactional(readOnly = true)
  public Planet getPlanet(String planet) {
    return planetDAO.getById(planet);
  }
}
