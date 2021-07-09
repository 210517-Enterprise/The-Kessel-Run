package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data @AllArgsConstructor @NoArgsConstructor
public class Riddle {

	@Id
	@Column(name="riddle_id",nullable=false, unique=true, updatable= false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Length(min=1) 
	private String riddle;
	
	@NotEmpty
	private String correctAnswer;
	
	@NotBlank // this comes From java EE from javax.val...
	private String[] incorrectAnswer;
	
	private Planet planet;
	
}
