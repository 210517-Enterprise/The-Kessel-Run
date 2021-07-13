package com.revature.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class)
public class User {

	@Id
	@Column(name = "user_id", updatable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Length(min = 5)
	@Column(unique = true)
	@Pattern(regexp = "[a-zA-Z][a-zA-Z0-9]*") // using regex to make sure that only alphanumeric characters are allowed, no spaces allowed
	private String username;

	@NotBlank
	private String pass;

	@Length(min = 1) // hibernate specific
	// @Size this is another you can use, less specific
	private String name;// as in the character name

	private String race;
	
	private String skinColor;

	private String hairColor;

	private String eyeColor;// An array of string options //idea

  private String copilot;

	private String starship;

	private String model;

  private int credits;
	
	private int bounty;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Planet planet;

  public User(@Length(min = 5) @Pattern(regexp = "[a-zA-Z][a-zA-Z0-9]*") String username, @NotBlank String pass,
      @Length(min = 1) String name, String race, String skinColor, String hairColor, String eyeColor, String copilot) {
    this.username = username;
    this.pass = pass;
    this.name = name;
    this.race = race;
    this.skinColor = skinColor;
    this.hairColor = hairColor;
    this.eyeColor = eyeColor;
    this.copilot = copilot;
    this.starship = "YT-1300 light freighter";
    this.credits = 0;
    this.bounty = 0;
  }



}
