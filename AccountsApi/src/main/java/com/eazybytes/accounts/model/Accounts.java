package com.eazybytes.accounts.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Accounts {

	@Column(name="customer_id")
	private long customerId;
	@Column(name="account_number")
	@Id
	private long accountNummber;
	@Column(name="account_type")
	private String accountType;
	@Column(name="branch_address")
	private String branchAddress;
	@Column(name="create_dt")
	private LocalDate createDt;
}
