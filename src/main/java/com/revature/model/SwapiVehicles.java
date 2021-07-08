package com.revature.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter

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
	@Setter
	private String name;
	@Setter
	private String model;
	@Setter
	private String vehicle_class;
	@Setter
	private String manufacturer;
	@Setter
	private String cost_in_credits;			// Galactic Credits
	@Setter
	private String length;					// In meters
	@Setter
	private String crew;					// Number needed to operate
	@Setter
	private String passengers;				// Number of non-crew that it can hold
	@Setter
	private String max_atmosphering_speed;	// Undefined unit. Probably meters/second. "N/A" if incapable of atmospheric flight/travel
	@Setter
	private String cargo_capacity;			// In kilograms
	@Setter
	private String consumables;				// The max time that can provide consumables for its entire crew.
											// Could be "0", "none", "unknown"
	// unique setter
	private String[]  films;
	private int[] filmsId;
	// unique setter
	private String[] pilots;				// This is the same resource as api/people
	private int[] pilotsId;
	@Setter
	private String created;
	@Setter
	private String edited;
	// unique setter
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
	
	public void setFilms(String[] films) {
		this.films = films;
		if (films != null && films.length > 0) {
			this.filmsId = parseIds(films);
		} else {
			this.filmsId = null;
		}
	}

	public void setPilots(String[] pilots) {
		this.pilots = pilots;
		if (pilots != null && pilots.length > 0) {
			this.pilotsId = parseIds(pilots);
		} else {
			this.pilotsId = null;
		}
	}

	public void setUrl(String url) {
		this.url = url;
		this.id = parseId(url);
	}

}
