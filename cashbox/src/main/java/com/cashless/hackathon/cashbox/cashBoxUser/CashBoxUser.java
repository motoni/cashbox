package com.cashless.hackathon.cashbox.cashBoxUser;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.cashless.hackathon.cashbox.cashBoxUserType.CashBoxUserType;
@Entity
@Table
public class CashBoxUser {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String userName;
	private int phoneNumber;
	@OneToOne
	private CashBoxUserType cashBoxUserType;
	private Date createdDate;
	private Date updatedDate;

}
