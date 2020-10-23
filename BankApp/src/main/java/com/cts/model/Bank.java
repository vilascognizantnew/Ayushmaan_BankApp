package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="bank")
public class Bank {
	
	@Id
	private int bankId;
	private String bankName;
	private String bankBranch;
	private String bankCity;
	private int bankLimit;
	
	public Bank() {
		super();
	}

	

	public Bank(int bankId, String bankName, String bankBranch, String bankCity, int bankLimit) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.bankBranch = bankBranch;
		this.bankCity = bankCity;
		this.bankLimit = bankLimit;
	}



	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankBranch() {
		return bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	public String getBankCity() {
		return bankCity;
	}

	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}

	public int getBankLimit() {
		return bankLimit;
	}

	public void setBankLimit(int bankLimit) {
		this.bankLimit = bankLimit;
	}
	
	


}
