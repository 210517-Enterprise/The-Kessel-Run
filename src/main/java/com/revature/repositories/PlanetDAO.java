package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Planet;

public interface PlanetDAO extends JpaRepository<Planet, Integer> {

}
