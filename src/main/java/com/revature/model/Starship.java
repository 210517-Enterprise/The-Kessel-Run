package com.revature.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Starship {

	@Getter @Setter
	private int count;
	
	@Getter @Setter
	private String next;
	
	@Getter @Setter
	private List<Starship> results;
	
	@Getter @Setter
	private String previous;
	
	@Setter
	private int id;
	
	public int getId() {
		return this.getUrl().charAt(this.getUrl().length()-2);
	}
	
	@Getter @Setter
	private String name;
	
	@Getter @Setter
	private String model;
	
	@Getter @Setter
	private String starship_class;
	
	@Getter @Setter 
	private String manufacturer;
	
	@Getter @Setter
	private String cost_in_credits;
	
	@Getter @Setter
	private String length;
	
	@Getter @Setter
	private String crew;
	
	@Getter @Setter
	private String passengers;
	
	@Getter @Setter
	private String max_atmosphering_speed;
	
	@Getter @Setter
	private String hyperdrive_rating;
	
	@Getter @Setter
	private String MGLT;
	
	@Getter @Setter
	private String cargo_capacity;
	
	@Getter @Setter
	private String consumables;
	
	@Getter @Setter
	private String[] films;
	
	@Getter @Setter
	private String[] pilots;
	
	@Getter @Setter
	private String url;
	
	@Getter @Setter
	private String created;
	
	@Getter @Setter
	private String edited;
	
}
