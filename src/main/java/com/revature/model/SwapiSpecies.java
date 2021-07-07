package com.revature.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter

public class SwapiSpecies extends SwapiData {
	/*
	 * Every field is using the exact JSON names except when it is a parsed ID field
	 * like "homeworldId" or an array of parsed IDs like "filmsId". The parsed IDs
	 * are set whenever their related String[] of urls are set. If the array is
	 * empty, I've set the int[] to null. If homeworld is blank, I've set the
	 * homeworldId to 0. "unknown", "none" or "N/A" is always a possible entry
	 * for various fields.
	 */

	// This is the id number found at the end of the URL
	// It is set when this.url is set
	private int id;
//	Name is a searchable field via SWAPI
	@Setter
	private String name;
	@Setter
	private String classification;		// The classification of this species, such as "mammal" or "reptile".
	@Setter
	private String designation;			// The designation of this species, such as "sentient".
	@Setter
	private String average_height;		// The average height of this species in centimeters.
	@Setter
	private String skin_colors;			// A comma-separated string of common skin colors for this species,
	@Setter								// 		"none" if this species does not typically have skin.
	private String hair_colors;			// A comma-separated string of common hair colors for this species,
	@Setter								// 		"none" if this species does not typically have hair.
	private String eye_colors;			// A comma-separated string of common eye colors for this species,
										//		"none" if this species does not typically have eyes.
	@Setter
	private String average_lifespan;	// The average lifespan of this species in years.
	@Setter
	private String language;
	// unique setter
	private String homeworld;			// This is the same resource as api/planets
	private int homeworldId;			// We might have to have a call to our static table to display a name rather than a number
	
	/*
	 * I think the connecting data is interesting but not essential.
	 * And the created and edited dates are not necessary for
	 * our project but they're here for completeness of all the returned "properties"
	 */
	// unique setter
	private String[] people;			// This is the same resource as api/people
	private int[] peopleId;
	// unique setter
	private String[] films;				// This is the same resource as api/films
	private int[] filmsId;
	@Setter
	private String created;
	@Setter
	private String edited;
	// unique setter
	private String url;
	
	/*
	 * Example JSON return
	 {
		"name": "Human",
		"classification": "mammal",
		"designation": "sentient",
		"average_height": "180",
		"skin_colors": "caucasian, black, asian, hispanic",
		"hair_colors": "blonde, brown, black, red",
		"eye_colors": "brown, blue, green, hazel, grey, amber",
		"average_lifespan": "120",
		"homeworld": "https://swapi.dev/api/planets/9/",
		"language": "Galactic Basic",
		"people": [
			"https://swapi.dev/api/people/66/",
			"https://swapi.dev/api/people/67/",
			"https://swapi.dev/api/people/68/",
			"https://swapi.dev/api/people/74/"
		],
		"films": [
			"https://swapi.dev/api/films/1/",
			"https://swapi.dev/api/films/2/",
			"https://swapi.dev/api/films/3/",
			"https://swapi.dev/api/films/4/",
			"https://swapi.dev/api/films/5/",
			"https://swapi.dev/api/films/6/"
		],
		"created": "2014-12-10T13:52:11.567000Z",
		"edited": "2014-12-20T21:36:42.136000Z",
		"url": "https://swapi.dev/api/species/1/"
	}
	 */

	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
		if (homeworld != null) {
			this.homeworldId = parseId(homeworld);
		} else {
			this.homeworldId = 0;
		}
	}

	public void setPeople(String[] people) {
		this.people = people;
		if (people != null && people.length > 0) {
			this.peopleId = parseIds(people);
		} else {
			this.peopleId = null;
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

	public void setUrl(String url) {
		this.url = url;
		this.id = parseId(url);
	}

}
