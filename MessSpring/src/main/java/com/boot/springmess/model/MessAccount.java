package com.boot.springmess.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MessAccount {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long messId;
	@NotBlank(message = "Enter Mess Name")
	private String messName;
	@NotBlank(message = "Mess owner cannot be empty")
	private String messOwner;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "addressId", referencedColumnName = "addressId")
	private Address address;
	private String contactNo;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "adminId", referencedColumnName = "adminId")
	private MessLogin messLogin;
	 private Instant created;
}
