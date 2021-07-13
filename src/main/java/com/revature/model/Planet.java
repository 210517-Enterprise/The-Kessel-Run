package com.revature.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "planet")
@Data
@AllArgsConstructor
@NoArgsConstructor

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="name") // This defaults to generating references to
																			// this object as just its id
public class Planet {

	@Id
	private String name;

	@OneToMany(mappedBy = "planet", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<User> users;// represents the users on the planet // another way to think of it is as
							// players currently the planet

	@OneToMany(mappedBy="planet", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Riddle> riddles;
}
