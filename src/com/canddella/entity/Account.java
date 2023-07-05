package com.canddella.entity;

public class Account {

	private String accountNumber;
	private String accountType;
	private String accountCreateDate;
	private double balance;

	public Account(String accountNumber, String accountType, String accountCreateDate, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountCreateDate = accountCreateDate;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountCreateDate() {
		return accountCreateDate;
	}

	public void setAccountCreateDate(String accountCreateDate) {
		this.accountCreateDate = accountCreateDate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
