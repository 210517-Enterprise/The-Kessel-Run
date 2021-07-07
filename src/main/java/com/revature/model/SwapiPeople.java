package com.revature.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class SwapiPeople extends SwapiData {
	/*
	 * Every field is using the exact JSON names except when it is a parsed ID field
	 * like "homeworldId" or an array of parsed IDs like "filmsId". The parsed IDs
	 * are set whenever their related String[] of urls are set. If the array is
	 * empty, I've set the int[] to null. If homeworld is blank, I've set the
	 * homeworldId to 0. "unknown", "none" or "N/A" is always a possible entry
	 */

	// This is the id number found at the end of the URL
	// It is set when this.url is set
	private int id;

	// Name is the searchable field via SWAPI
	private String name;
	private String birth_year;	// Standard of BBY or ABY - Before the Battle of Yavin or After the Battle of Yavin.
	private String eye_color;	// Will be "unknown" if not known or "n/a" if the person does not have an eye.
	private String gender;		// Will be "Male", "Female" or "unknown", "n/a" if the person does not have a gender.
	private String hair_color;	// Will be "unknown" if not known or "n/a" if the person does not have hair.
	private String height;		// in centimeters
	private String mass;		// in kilograms
	private String skin_color;
	
	private String homeworld;	// We might have to have a call to our static table to display a name rather than
	private int homeworldId;	// a url when displaying this field.

	/*
	 * I think the connecting data is interesting but not essential.
	 * And the created and edited dates are not necessary for
	 * our project but they're here for completeness
	 */

	private String[] films;
	private int[] filmsId;

	private String[] species;	// We might have to have a call to our static table to display a name rather than 
	private int[] speciesId;	// a url when displaying this field (this is, at most, one index long).

	private String[] vehicles;
	private int[] vehiclesId;

	private String[] starships;
	private int[] starshipsId;

	private String url;
	private String created;
	private String edited;
	
	/* 
	 * Example JSON return
{
    "name": "Luke Skywalker",
    "height": "172",
    "mass": "77",
    "hair_color": "blond",
    "skin_color": "fair",
    "eye_color": "blue",
    "birth_year": "19BBY",
    "gender": "male",
    "homeworld": "https://swapi.dev/api/planets/1/",
    "films": [
        "https://swapi.dev/api/films/1/",
        "https://swapi.dev/api/films/2/",
        "https://swapi.dev/api/films/3/",
        "https://swapi.dev/api/films/6/"
    ],
    "species": [],
    "vehicles": [
        "https://swapi.dev/api/vehicles/14/",
        "https://swapi.dev/api/vehicles/30/"
    ],
    "starships": [
        "https://swapi.dev/api/starships/12/",
        "https://swapi.dev/api/starships/22/"
    ],
    "created": "2014-12-09T13:50:51.644000Z",
    "edited": "2014-12-20T21:17:56.891000Z",
    "url": "https://swapi.dev/api/people/1/"
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

	public String getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(String birth_year) {
		this.birth_year = birth_year;
	}

	public String getEye_color() {
		return eye_color;
	}

	public void setEye_color(String eye_color) {
		this.eye_color = eye_color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHair_color() {
		return hair_color;
	}

	public void setHair_color(String hair_color) {
		this.hair_color = hair_color;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getMass() {
		return mass;
	}

	public void setMass(String mass) {
		this.mass = mass;
	}

	public String getSkin_color() {
		return skin_color;
	}

	public void setSkin_color(String skin_color) {
		this.skin_color = skin_color;
	}

	public String getHomeworld() {
		return homeworld;
	}

	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
		if (homeworld != null && !homeworld.isEmpty()) {
			this.homeworldId = parseId(homeworld);
		} else {
			this.homeworldId = 0;
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

	public int[] getFilmsId() {
		return filmsId;
	}

	public String[] getSpecies() {
		return species;
	}

	public void setSpecies(String[] species) {
		this.species = species;
		if (species.length > 0) {
			this.speciesId = parseIds(species);
		} else {
			this.speciesId = null;
		}
	}

	public int[] getSpeciesId() {
		return speciesId;
	}

	public String[] getVehicles() {
		return vehicles;
	}

	public void setVehicles(String[] vehicles) {
		this.vehicles = vehicles;
		if (vehicles != null && vehicles.length > 0) {
			this.vehiclesId = parseIds(vehicles);
		} else {
			this.vehiclesId = null;
		}
	}

	public String[] getStarships() {
		return starships;
	}

	public void setStarships(String[] starships) {
		this.starships = starships;
		if (starships != null && starships.length > 0) {
			this.starshipsId = parseIds(starships);
		} else {
			this.starshipsId = null;
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

	public int getHomeworldId() {
		return homeworldId;
	}

	public int[] getVehiclesId() {
		return vehiclesId;
	}

	public int[] getStarshipsId() {
		return starshipsId;
	}
	
}
