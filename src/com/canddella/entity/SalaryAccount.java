package com.canddella.entity;

public class SalaryAccount extends SavingsAccount {

	public SalaryAccount(String accountNumber, String accountType, String accountCreateDate, double balance) {
		super(accountNumber, accountType, accountCreateDate, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void minBalance() {
		// TODO Auto-generated method stub
		setMinBalance(5000);

	}

	@Override
	public void atmDetails() {
		// TODO Auto-generated method stub
		System.out.println("ATM card is chargable......");

	}

}
