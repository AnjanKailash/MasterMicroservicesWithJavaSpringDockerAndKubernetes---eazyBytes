package com.eazybytes.accounts.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class Customer {

	@Column(name="customer_id")
	@Id
	private Long customerId;
	
	@Column(name="name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name="mobile_nnumber")
	private String mobileNumber;
	
	@Column(name="create_dt")
	private LocalDate createDt;
}
