package com.boot.springmess.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long addressId;
	@NotBlank(message = "Place cannot be empty")
	private String place;
	@NotBlank(message = "City cannot be empty")
	private String city;
	@NotBlank(message = "State cannot be empty")
	private String state;
	@NotBlank(message = "Pincode cannot be empty")
	private Integer pincode; 
}
