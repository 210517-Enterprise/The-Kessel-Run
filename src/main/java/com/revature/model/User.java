package com.revature.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NamedNativeQuery(name = "User.updatePlanet", query = "UPDATE users SET planet=? WHERE id=?", resultClass = User.class)
@NamedNativeQuery(name = "User.updateStarship", query = "UPDATE users SET starship=? WHERE id=?", resultClass = User.class)
@NamedNativeQuery(name = "User.updateModel", query = "UPDATE users SET model=? WHERE id=?", resultClass = User.class)
@NamedNativeQuery(name = "User.updateCopilot", query = "UPDATE users SET copilot=? WHERE id=?", resultClass = User.class)
@NamedNativeQuery(name = "User.updateCredits", query = "UPDATE users SET credits=? + ? WHERE id=?", resultClass = User.class)
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class User {

	@Id
	@Column(name = "user_id", nullable = false, unique = true, updatable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Length(min = 1) // hibernate specific
	// @Size this is another you can use, less specific
	private String name;// as in the character name

	@Length(min = 5)
	@NotBlank // this comes From java EE from javax.val...
	@Pattern(regexp = "[a-zA-Z][a-zA-Z0-9]*") // using regex to make sure that only alphanumeric characters are allowed,
												// no spaces allowed
	private String username;

	@NotEmpty
	private String password;

	private int credits;// currency the user has at a given moment

	private String race;

	private String hair_color;

	private String eye_color;// An array of string options //idea

	private String starship;

	private String model;

	private String copilot;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Planet planet;

	public User(int id, @Length(min = 1) String name,
			@Length(min = 5) @NotBlank @Pattern(regexp = "[a-zA-Z][a-zA-Z0-9]*") String username,
			@NotEmpty String password) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
	}

}
