package com.revature.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Planet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String desc;//description
	
		
	// JsonBackReference is the annotation that correlates to this one
	@JsonManagedReference("label2") // prevent an infinite loop when we create JSON for these bi-directional relationship objects
	@OneToMany(cascade= CascadeType.ALL, fetch=FetchType.EAGER) // easier to laod this data in the case that a session is closed but we need this data
	private Set<User> users;//represents the users on the planet // another way to think of it is as players currently the planet
}
