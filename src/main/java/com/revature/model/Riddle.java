package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data @AllArgsConstructor @NoArgsConstructor
public class Riddle {

	@Id
	@Column(name="riddle_id", updatable= false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	private String riddle;
	
	@NotBlank
	private String correctAnswer;
	
	@NotBlank
	private String incorrectAnswer1;

	@NotBlank
	private String incorrectAnswer2;
	
	@NotBlank
	private String incorrectAnswer3;
	
	@JsonIgnoreProperties("planet")
	@ManyToOne
	private Planet planet;
	
}
