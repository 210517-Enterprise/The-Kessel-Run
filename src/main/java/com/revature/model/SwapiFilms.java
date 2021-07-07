package com.revature.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class SwapiFilms extends SwapiData {
	/*
	 * Every field is using the exact JSON names except when it is a parsed ID field
	 * like "id" or an array of parsed IDs like "planetsId". The parsed IDs are set
	 * whenever their related String[] of urls are set. If the array is empty, I've
	 * set the int[] to null. "unknown", "none" or "N/A" is always a possible entry
	 * for various fields
	 */

	// This is the id number found at the end of the URL
	// It is set when setUrl() is called.
	private int id;

//	Title is a searchable field via SWAPI
	private String title;
	private int episode_id;			//	This one field is returned as an integer, NOT a String
	private String director;
	private String producer;
	private String release_date;	// "YYYY-MM-DD"
	private String opening_crawl;	// This is a formatted String with line breaks
	private String url;
	
	/*
	 * I think the connecting data is interesting but not essential.
	 * And the created and edited dates are not necessary for
	 * our project but they're here for completeness of all the returned "properties"
	 */
	
	private String[] characters;	// This is the same resource as api/people
	private int[] charactersId;
	
	private String[] planets;		// This is the same resource as api/planets
	private int[] planetsId;
	
	private String[] starships;		// This is the same resource as api/starships
	private int[] starshipsId;
	
	private String[] vehicles;		// This is the same resource as api/vehicles
	private int[] vehiclesId;
	
	private String[] species;		// This is the same resource as api/species
	private int[] speciesId;
	
	private String created;
	private String edited;
	
	/*
	 * Example JSON return
	{
	...
    "properties": {
        "characters": [ "https://www.swapi.tech/api/people/1/", ... ],
        "created": "2014-12-10T14:23:31.880000Z",
        "director": "George Lucas",
        "edited": "2014-12-12T11:24:39.858000Z",
        "episode_id": 4,
        "opening_crawl": "It is a period of civil war ...",
        "planets": [ "https://www.swapi.tech/api/planets/1/", ... ],
        "producer": "Gary Kurtz, Rick McCallum",
        "release_date": "1977-05-25",
        "species": [ "https://www.swapi.tech/api/species/1/", ... ],
        "starships": [ "https://www.swapi.tech/api/starships/2/", ... ],
        "title": "A New Hope",
        "url": "https://www.swapi.tech/api/films/1/",
        "vehicles": [ "https://www.swapi.tech/api/vehicles/4/", ... ]
      }
     ...
     }
	 */
	
	public int getId() {
		return id;
	}

	public String[] getCharacters() {
		return characters;
	}

	public void setCharacters(String[] characters) {
		this.characters = characters;
		if (characters != null && characters.length > 0) {
			this.charactersId = parseIds(characters);
		} else {
			this.charactersId = null;
		}

	}

	public String[] getPlanets() {
		return planets;
	}

	public void setPlanets(String[] planets) {
		this.planets = planets;
	}

	public int[] getPlanetsId() {
		return planetsId;
	}

	public void setPlanetsId(int[] planetsId) {
		this.planetsId = planetsId;
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

	public String[] getSpecies() {
		return species;
	}

	public void setSpecies(String[] species) {
		this.species = species;
		if (species != null && species.length > 0) {
			this.speciesId = parseIds(species);
		} else {
			this.speciesId = null;
		}
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

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getEpisode_id() {
		return episode_id;
	}

	public void setEpisode_id(int episode_id) {
		this.episode_id = episode_id;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public String getOpening_crawl() {
		return opening_crawl;
	}

	public void setOpening_crawl(String opening_crawl) {
		this.opening_crawl = opening_crawl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
		this.id = parseId(url);
	}

	public int[] getCharactersId() {
		return charactersId;
	}

	public int[] getStarshipsId() {
		return starshipsId;
	}

	public int[] getVehiclesId() {
		return vehiclesId;
	}

	public int[] getSpeciesId() {
		return speciesId;
	}

}
