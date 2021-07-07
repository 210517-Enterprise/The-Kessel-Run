package com.revature.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter

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
	@Setter
	private String name;
	@Setter
	private String birth_year;	// Standard of BBY or ABY - Before the Battle of Yavin or After the Battle of Yavin.
	@Setter
	private String eye_color;	// Will be "unknown" if not known or "n/a" if the person does not have an eye.
	@Setter
	private String gender;		// Will be "Male", "Female" or "unknown", "n/a" if the person does not have a gender.
	@Setter
	private String hair_color;	// Will be "unknown" if not known or "n/a" if the person does not have hair.
	@Setter
	private String height;		// in centimeters
	@Setter
	private String mass;		// in kilograms
	@Setter
	private String skin_color;
	// unique setter
	private String homeworld;	// We might have to have a call to our static table to display a name rather than
	private int homeworldId;	// a url when displaying this field.

	/*
	 * I think the connecting data is interesting but not essential.
	 * And the created and edited dates are not necessary for
	 * our project but they're here for completeness
	 */
	
	// unique setter
	private String[] films;
	private int[] filmsId;
	// unique setter
	private String[] species;	// We might have to have a call to our static table to display a name rather than 
	private int[] speciesId;	// a url when displaying this field (this is, at most, one index long).
	// unique setter
	private String[] vehicles;
	private int[] vehiclesId;
	// unique setter
	private String[] starships;
	private int[] starshipsId;
	// unique setter
	private String url;
	@Setter
	private String created;
	@Setter
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

	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
		if (homeworld != null && !homeworld.isEmpty()) {
			this.homeworldId = parseId(homeworld);
		} else {
			this.homeworldId = 0;
		}
	}
	
	public void setFilms(String[] films) {
		this.films = films;
		if (films != null && films.length > 0) {
			this.filmsId = parseIds(films);
		} else {
			this.filmsId = null;
		}
	}

	public void setSpecies(String[] species) {
		this.species = species;
		if (species.length > 0) {
			this.speciesId = parseIds(species);
		} else {
			this.speciesId = null;
		}
	}

	public void setVehicles(String[] vehicles) {
		this.vehicles = vehicles;
		if (vehicles != null && vehicles.length > 0) {
			this.vehiclesId = parseIds(vehicles);
		} else {
			this.vehiclesId = null;
		}
	}

	public void setStarships(String[] starships) {
		this.starships = starships;
		if (starships != null && starships.length > 0) {
			this.starshipsId = parseIds(starships);
		} else {
			this.starshipsId = null;
		}
	}

	public void setUrl(String url) {
		this.url = url;
		this.id = parseId(url);
	}
	
}
