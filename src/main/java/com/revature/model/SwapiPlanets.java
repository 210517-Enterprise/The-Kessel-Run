package com.revature.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class SwapiPlanets extends SwapiData {
	/*
	 * Every field is using the exact JSON names except when it is a parsed ID field
	 * like "id" or an array of parsed IDs like "filmsId". The parsed IDs are set
	 * whenever their related String[] of urls are set. If the array is empty, I've
	 * set the int[] to null; "unknown", "none" or "N/A" is always a possible entry
	 * for various fields
	 */

	// This is the id number found at the end of the URL
	// It is set when setUrl() is called.
	private int id;
	
	// Name is a searchable field via SWAPI
	private String name;

	private String rotation_period;	// The number of standard hours it takes for this planet to complete a single
									// rotation on its axis.
	
	private String orbital_period;	// The number of standard days it takes for this planet
									// to complete a single orbit of its local star.
	
	private String diameter;		// The diameter of this planet in kilometers.
	
	
	private String climate;			// The climate of this planet. Comma separated if diverse.
	
	
	private String terrain;			// The terrain of this planet. Comma separated if diverse.

	
	private String gravity;			// A number denoting the gravity of this planet, where "1" is 1 standard G.
									// "2" is twice or 2 standard Gs. "0.5" is half or 0.5 standard Gs.
	
	private String surface_water;	// The percentage of the planet surface that is naturally occurring water
									// or bodies of water.
	
	private String population;		// The average population of sentient beings inhabiting this planet.

	private String[] residents;		// This is the same resource as api/people
	private int[] residentsId;
	
	private String[] films;			// This is the same resource as api/films
	private int[] filmsId;
	
	private String url;
	private String created;
	private String edited;
	
	/*
	 * Example JSON return
	 {
	    "name": "Bespin",
	    "rotation_period": "12",
	    "orbital_period": "5110",
	    "diameter": "118000",
	    "climate": "temperate",
	    "gravity": "1.5 (surface), 1 standard (Cloud City)",
	    "terrain": "gas giant",
	    "surface_water": "0",
	    "population": "6000000",
	    "residents": [
	        "https://swapi.dev/api/people/26/"
	    ],
	    "films": [
	        "https://swapi.dev/api/films/2/"
	    ],
	    "created": "2014-12-10T11:43:55.240000Z",
	    "edited": "2014-12-20T20:58:18.427000Z",
	    "url": "https://swapi.dev/api/planets/6/"
	}
	 */
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRotation_period() {
		return rotation_period;
	}

	public void setRotation_period(String rotation_period) {
		this.rotation_period = rotation_period;
	}

	public String getOrbital_period() {
		return orbital_period;
	}

	public void setOrbital_period(String orbital_period) {
		this.orbital_period = orbital_period;
	}

	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getGravity() {
		return gravity;
	}

	public void setGravity(String gravity) {
		this.gravity = gravity;
	}

	public String getTerrain() {
		return terrain;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	public String getSurface_water() {
		return surface_water;
	}

	public void setSurface_water(String surface_water) {
		this.surface_water = surface_water;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String[] getResidents() {
		return residents;
	}

	public void setResidents(String[] residents) {
		this.residents = residents;
		if (residents != null && residents.length > 0) {
			this.residentsId = parseIds(residents);
		} else {
			this.residentsId = null;
		}
	}

	public String[] getFilms() {
		return films;
	}

	public void setFilms(String[] films) {
		this.films = films;
		if (films != null && films.length > 0) {
			this.filmsId = parseIds(films);
		} else {
			this.filmsId = null;
		}
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
		this.id = parseId(url);
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getEdited() {
		return edited;
	}

	public void setEdited(String edited) {
		this.edited = edited;
	}

	public int[] getResidentsId() {
		return residentsId;
	}

	public int[] getFilmsId() {
		return filmsId;
	}

}
