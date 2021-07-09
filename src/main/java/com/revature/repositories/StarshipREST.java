package com.revature.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.revature.model.Starship;
import com.revature.model.StarshipList;

public class StarshipREST {
	
	public static void main(String[] args) {
		StarshipREST sr = new StarshipREST();
		System.out.println(sr.getStarshipById(9).getId()+1);
	}
	
	public List<Starship> getAllStarships() {
		RestTemplate restTemplate = new RestTemplate();
		
		Starship starship = restTemplate.getForObject("https://swapi.dev/api/starships", Starship.class);
		List<Starship> starships = new ArrayList<>();
		
		while (starships.size() < starship.getCount()) {
			starships.addAll(starship.getResults());
			if(starship.getNext() != null) {
				starship = restTemplate.getForObject(starship.getNext(), Starship.class);
			}
		}
		return starships;
		
	}
		

	public Starship getStarshipById(int id) {
		RestTemplate restTemplate = new RestTemplate();
		
		Starship starship = restTemplate.getForObject("https://swapi.dev/api/starships/" + id, Starship.class);
		return starship;
	}
			
		
		
	
}
