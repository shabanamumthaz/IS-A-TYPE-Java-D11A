package com.canddella.utility;

import java.util.Scanner;

import com.canddella.entity.SavingsAccount;
import com.canddella.service.Service;

public class Utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		SavingsAccount savingAccount=null;
		boolean value=false;
		
		do
		{
		System.out.println("****Welcome to ABC Bank****");
		System.out.println("1.Salary Account\n2.Rural Account\n3.Display Details \nEnter your choice:");
		int choice=scanner.nextInt();
		
		switch(choice) {
		
		case 1:
			savingAccount=Service.createAccount(choice);
			break;
		
		case 2:
			savingAccount=Service.createAccount(choice);
			break;
			
		case 3:
			Service.displayDetails(savingAccount);
		default :
			break;
			
		}
		
		System.out.println("Do you want to continue: 1.yes 2.No");
		int decision=scanner.nextInt();
		
		if(decision==1)
		{
			value=true;
		}
		else if(decision==2)
		{
			value=true;
		}
		else
			System.out.println("Invalid Output");	
		
		}
		while(value);
		
		
		
		
		
		
		

	}

}
