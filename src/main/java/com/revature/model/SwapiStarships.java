package com.revature.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter

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
	@Setter
	private String name;					// The common name, such as "Death Star".
	@Setter
	private String model;					// The official name, such as "DS-1 Orbital Battle Station".
	@Setter
	private String starship_class;			// The class of ship, such as "Deep Space Mobile Battlestation"
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
	private String hyperdrive_rating;		// "4.0" example value
	@Setter
	private String MGLT;					// The max number of Megalights this starship can travel in a standard hour.
											// This unit is undefined in canon but might be comparable to the AU (Astronomical unit)
	@Setter
	private String cargo_capacity;			// In kilograms
	@Setter
	private String consumables;				// The max time that can provide consumables for its entire crew.
	// unique setter
	private String[] films;
	private int[] filmsId;
	// unique setter
	private String[] pilots;				// This is the same resource as api/people
	private int[] pilotsId;
	// unique setter
	private String url;
	@Setter
	private String created;
	@Setter
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
