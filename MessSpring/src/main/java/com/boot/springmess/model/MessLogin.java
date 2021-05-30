package com.boot.springmess.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity 
public class MessLogin {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long adminId;
	@Email
	@NotBlank(message = "Email ID cannot be empty")
	private String email;

	@NotBlank(message = "Password Cannot be empty")
	private String password;

	private boolean enabled;
	private Instant created;

}
