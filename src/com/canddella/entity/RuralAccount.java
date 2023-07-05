package com.canddella.entity;

public class RuralAccount extends SavingsAccount {

	public RuralAccount(String accountNumber, String accountType, String accountCreateDate, double balance) {
		super(accountNumber, accountType, accountCreateDate, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void minBalance() {
		// TODO Auto-generated method stub
		setMinBalance(100);

	}

	@Override
	public void atmDetails() {
		// TODO Auto-generated method stub
		System.out.println("You have free Atm!!!!!!!!");

	}

}
