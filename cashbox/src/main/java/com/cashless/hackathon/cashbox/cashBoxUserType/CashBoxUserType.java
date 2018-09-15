package com.cashless.hackathon.cashbox.cashBoxUserType;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class CashBoxUserType {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String userName;
	private int phoneNumber;
	private Date createdDate;
	private Date updatedDate;

}
