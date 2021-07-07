package com.revature.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class SwapiStarships extends SwapiData {
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
	
	/*  
	 * The id sequence is shared between starships and vehicles
	 *  (probably a later division into two categories)
	 * 	possible ids:	[2,3,5,9,10,11,12,13,15,17,21,22,23,27,28,29,31,32,39
	 * 					40,41,43,47,48,49,52,58,59,61,63,64,65,66,68,74,75]
	 */

	// Name and model are searchable fields via SWAPI
	private String name;					// The common name, such as "Death Star".
	private String model;					// The official name, such as "DS-1 Orbital Battle Station".
	private String starship_class;			// The class of ship, such as "Deep Space Mobile Battlestation"
	private String manufacturer;
	private String cost_in_credits;			// Galactic Credits
	private String length;					// In meters
	private String crew;					// Number needed to operate
	private String passengers;				// Number of non-crew that it can hold
	private String max_atmosphering_speed;	// Undefined unit. Probably meters/second. "N/A" if incapable of atmospheric flight/travel
	private String hyperdrive_rating;		// "4.0" example value
	private String MGLT;					// The max number of Megalights this starship can travel in a standard hour.
											// This unit is undefined in canon but might be comparable to the AU (Astronomical unit)
	private String cargo_capacity;			// In kilograms
	private String consumables;				// The max time that can provide consumables for its entire crew.
	
	private String[] films;
	private int[] filmsId;
	
	private String[] pilots;				// This is the same resource as api/people
	private int[] pilotsId;
	
	private String url;
	private String created;
	private String edited;
	
	/*
	 * Example JSON return
        {
            "name": "CR90 corvette",
            "model": "CR90 corvette",
            "manufacturer": "Corellian Engineering Corporation",
            "cost_in_credits": "3500000",
            "length": "150",
            "max_atmosphering_speed": "950",
            "crew": "30-165",
            "passengers": "600",
            "cargo_capacity": "3000000",
            "consumables": "1 year",
            "hyperdrive_rating": "2.0",
            "MGLT": "60",
            "starship_class": "corvette",
            "pilots": [],
            "films": [
                "https://swapi.dev/api/films/1/",
                "https://swapi.dev/api/films/3/",
                "https://swapi.dev/api/films/6/"
            ],
            "created": "2014-12-10T14:20:33.369000Z",
            "edited": "2014-12-20T21:23:49.867000Z",
            "url": "https://swapi.dev/api/starships/2/"
        }
	 */
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getStarship_class() {
		return starship_class;
	}
	public void setStarship_class(String starship_class) {
		this.starship_class = starship_class;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCost_in_credits() {
		return cost_in_credits;
	}
	public void setCost_in_credits(String cost_in_credits) {
		this.cost_in_credits = cost_in_credits;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getCrew() {
		return crew;
	}
	public void setCrew(String crew) {
		this.crew = crew;
	}
	public String getPassengers() {
		return passengers;
	}
	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}
	public String getMax_atmosphering_speed() {
		return max_atmosphering_speed;
	}
	public void setMax_atmosphering_speed(String max_atmosphering_speed) {
		this.max_atmosphering_speed = max_atmosphering_speed;
	}
	public String getHyperdrive_rating() {
		return hyperdrive_rating;
	}
	public void setHyperdrive_rating(String hyperdrive_rating) {
		this.hyperdrive_rating = hyperdrive_rating;
	}
	public String getMGLT() {
		return MGLT;
	}
	public void setMGLT(String mGLT) {
		MGLT = mGLT;
	}
	public String getCargo_capacity() {
		return cargo_capacity;
	}
	public void setCargo_capacity(String cargo_capacity) {
		this.cargo_capacity = cargo_capacity;
	}
	public String getConsumables() {
		return consumables;
	}
	public void setConsumables(String consumables) {
		this.consumables = consumables;
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
	public String[] getPilots() {
		return pilots;
	}
	public void setPilots(String[] pilots) {
		this.pilots = pilots;
		if (pilots != null && pilots.length > 0) {
			this.pilotsId = parseIds(pilots);
		} else {
			this.pilotsId = null;
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
	public int getId() {
		return id;
	}
	public int[] getFilmsId() {
		return filmsId;
	}
	public int[] getPilotsId() {
		return pilotsId;
	}

}
