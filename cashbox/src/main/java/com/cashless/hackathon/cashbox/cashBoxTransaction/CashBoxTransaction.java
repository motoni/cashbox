package com.cashless.hackathon.cashbox.cashBoxTransaction;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.cashless.hackathon.cashbox.cashBoxUser.CashBoxUser;

@Table
@Entity
public class CashBoxTransaction {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@OneToOne
	private CashBoxUser customer;
	@OneToOne
	private CashBoxUser merchant;
	private int phoneNumber;
	private enum transactionType {DR,CR};
	private Date createdDate;
	private Date updatedDate;
	private Double amount;
	
	public CashBoxTransaction() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public CashBoxUser getCustomer() {
		return customer;
	}

	public void setCustomer(CashBoxUser customer) {
		this.customer = customer;
	}

	public CashBoxUser getMerchant() {
		return merchant;
	}

	public void setMerchant(CashBoxUser merchant) {
		this.merchant = merchant;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	


}
