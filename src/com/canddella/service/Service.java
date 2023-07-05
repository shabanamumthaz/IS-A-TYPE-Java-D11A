package com.canddella.service;

import com.canddella.entity.RuralAccount;
import com.canddella.entity.SalaryAccount;
import com.canddella.entity.SavingsAccount;

public class Service {

	public static SavingsAccount createAccount(int choice) {
		// TODO Auto-generated method stub
		SavingsAccount savingAccount = null;

		switch (choice) {

		case 1:
			savingAccount = new SalaryAccount("1011", "Savings Account", "30/06/22", 1000);
			break;

		case 2:
			savingAccount = new RuralAccount("1022", "Rural Account", "30/09/22", 5000);
		}

		return savingAccount;

	}

	public static void displayDetails(SavingsAccount savingAccount) {
		// TODO Auto-generated method stub
		SalaryAccount salaryAccount = null;
		RuralAccount ruralAccount = null;

		savingAccount.minBalance();
		if (savingAccount instanceof SalaryAccount) {
			System.out.println("Savings Account Details");
			System.out.println("-----------------------------------------------");
			salaryAccount = (SalaryAccount) savingAccount;
			System.out.println("Account Number:" + salaryAccount.getAccountNumber() + "\nAccount Creation Date:"
					+ salaryAccount.getAccountCreateDate() + "\nAccount Type:" + salaryAccount.getAccountType()
					+ "\nAccount Balance" + salaryAccount.getBalance());
			System.out.println("-----------------------------------------------");
			System.out.println("Your account minimum balance should be:" + salaryAccount.getMinBalance());
			salaryAccount.atmDetails();
		}
		if (savingAccount instanceof RuralAccount) {
			System.out.println("Rural Account Details");
			System.out.println("-----------------------------------------------");
			ruralAccount = (RuralAccount) savingAccount;
			System.out.println("Account Number:" + ruralAccount.getAccountNumber() + "\nAccount Creation Date:"
					+ ruralAccount.getAccountCreateDate() + "\nAccount Type: " + ruralAccount.getAccountType()
					+ "\nAccount Balance:" + ruralAccount.getBalance());
			System.out.println("-----------------------------------------------");
			System.out.println("Your account minimum balance should be:" + ruralAccount.getMinBalance());
			ruralAccount.atmDetails();
		}

	}

}
