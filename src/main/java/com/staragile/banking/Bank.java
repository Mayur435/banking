package com.staragile.banking;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	String accNo;
	String accName;
	String accAddress;
	String accMobNo;
	public Bank(String accNo, String accName, String accAddress, String accMobNo) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accAddress = accAddress;
		this.accMobNo = accMobNo;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccAddress() {
		return accAddress;
	}
	public void setAccAddress(String accAddress) {
		this.accAddress = accAddress;
	}
	public String getAccMobNo() {
		return accMobNo;
	}
	public void setAccMobNo(String accMobNo) {
		this.accMobNo = accMobNo;
	}
	
	
	
}
