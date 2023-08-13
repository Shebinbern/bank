package com.bank.bank.user.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(schema = "bank", catalog = "bank", name = "user")
@Data

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "username")
	private String userName;
	@Column(name = "password")
	private String password;
	@Column(name = "mobile_number")
	private String mobileNumber;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "bank_id")
	private int bankId;
	@Column(name = "status")
	private String status;
	@Column(name = "entry_on")
	private Date entryOn;
	@Column(name = "update_on")
	private Date updateOn;
	@Column(name = "delete_on")
	private Date deleteOn;

}
