package com.canddella.entity;

public abstract class SavingsAccount extends Account {

	private double minBalance;
	private String atmDetails;

	public SavingsAccount(String accountNumber, String accountType, String accountCreateDate, double balance) {
		super(accountNumber, accountType, accountCreateDate, balance);
		// TODO Auto-generated constructor stub
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	public String getAtmDetails() {
		return atmDetails;
	}

	public void setAtmDetails(String atmDetails) {
		this.atmDetails = atmDetails;
	}

	public abstract void minBalance();

	public abstract void atmDetails();
}
