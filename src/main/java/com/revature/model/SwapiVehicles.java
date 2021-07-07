package com.revature.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class SwapiVehicles extends SwapiData {
	/*
	 * Every field is using the exact JSON names except when it is a parsed ID
	 * field like id or an array of parsed IDs like planetsId.
	 * The parsed IDs are set whenever their related String[] of urls are set.
	 * If the array is empty, I've set the int[] to null;
	 * "unknown", "none" or "N/A" is always a possible entry for various fields.
	 */
	
//	 This is the id number found at the end of the URL
//	 It is set when setUrl() is called.
	private int id;
	
/*  
 * The id sequence is shared between starships and vehicles
 *  (probably a later division into two categories)
 * 	possible ids:	[4,6,7,8,14,16,18,19,20,24,25,26,30,33,34,35,36,37,38,42,
 * 					44,45,46,50,51,53,54,55,56,57,60,62,67,69,70,71,72,73,76]
 */
	
	// Name and model are searchable fields via SWAPI
	private String name;
	private String model;
	private String vehicle_class;
	private String manufacturer;
	private String cost_in_credits;			// Galactic Credits
	private String length;					// In meters
	private String crew;					// Number needed to operate
	private String passengers;				// Number of non-crew that it can hold
	private String max_atmosphering_speed;	// Undefined unit. Probably meters/second. "N/A" if incapable of atmospheric flight/travel
	private String cargo_capacity;			// In kilograms
	private String consumables;				// The max time that can provide consumables for its entire crew.
											// Could be "0", "none", "unknown"
	private String[]  films;
	private int[] filmsId;
	
	private String[] pilots;				// This is the same resource as api/people
	private int[] pilotsId;
	
	private String created; 
	private String edited;
	private String url;
	
	/*
	 * Example JSON return
		{
		    "name": "T-16 skyhopper",
		    "model": "T-16 skyhopper",
		    "manufacturer": "Incom Corporation",
		    "cost_in_credits": "14500",
		    "length": "10.4 ",
		    "max_atmosphering_speed": "1200",
		    "crew": "1",
		    "passengers": "1",
		    "cargo_capacity": "50",
		    "consumables": "0",
		    "vehicle_class": "repulsorcraft",
		    "pilots": [],
		    "films": [
		        "https://swapi.dev/api/films/1/"
		    ],
		    "created": "2014-12-10T16:01:52.434000Z",
		    "edited": "2014-12-20T21:30:21.665000Z",
		    "url": "https://swapi.dev/api/vehicles/6/"
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
		return vehicle_class;
	}
	public void setStarship_class(String vehicle_class) {
		this.vehicle_class = vehicle_class;
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
