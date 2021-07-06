package com.revature.model;

import java.util.List;

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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name="users")
public class User {

	@Id
	@Column(name="user_id",nullable=false, unique=true, updatable= false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Length(min=1) // hibernate specific
	// @Size this is another you can use, less specific
	private String name;//as in the character name
	
	@Length(min=5)
	@NotBlank // this comes From java EE from javax.val...
	@Pattern(regexp="[a-zA-Z][a-zA-Z0-9]*") // using regex to make sure that only alphanumeric characters are allowed, no spaces allowed
	private String username;
	
	@NotEmpty
	private String password;
	
	@Length(min=0)
	private int credits;//currency the user has at a given moment
	
	private String race;
	
	private String hair_color;
	
	private String eye_color;//An array of string options //idea
	
	private Starship starship;
	
	private List<Integer> listCrewMateId;
	
	// JsonBackReference is the annotation that correlates to this one
	@JsonManagedReference("label1") // prevent an infinite loop when we create JSON for these bi-directional relationship objects
	@ManyToOne(cascade= CascadeType.ALL, fetch=FetchType.EAGER) // easier to laod this data in the case that a session is closed but we need this data
	private Planet planet; 
	

	
}
