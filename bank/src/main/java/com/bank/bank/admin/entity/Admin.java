package com.bank.bank.admin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(schema = "bank", catalog = "bank", name = "admin")
@Data
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "data")
	private String data;
	@Column(name = "records")
	private String records;
	@Column(name = "email")
	private String email;
	@Column(name = "entry_on")
	private Date entryOn;
	@Column(name = "update_on")
	private Date updateOn;
	@Column(name = "delete_on")
	private Date deleteOn;

}
