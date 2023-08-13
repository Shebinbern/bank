package com.bank.bank.bank.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(schema="bank",catalog="bank",name="bank_details")
@Data
public class BankDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="bank_code")
	private String bankCode;
	@Column(name="bank_name")
	private String bankName;
	@Column(name="ifsc_code")
	private String ifscCode;
	@Column(name="branch_address")
	private String branchAddress;
	@Column(name="entry_on")
	private Date entry_On;
	@Column(name="update_on")
	private Date update_On;
	@Column(name="delete_on")
	private Date delete_On;
	

}
