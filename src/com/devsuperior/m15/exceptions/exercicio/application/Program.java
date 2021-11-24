package com.devsuperior.m15.exceptions.exercicio.application;

import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.m15.exceptions.exercicio.model.entities.Account;
import com.devsuperior.m15.exceptions.exercicio.model.exception.AccountException;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = scan.nextInt();
			System.out.print("Holder: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Initial balance: ");
			double balance = scan.nextDouble();
			System.out.print("Withdraw limit: ");
			double limit = scan.nextDouble();
			
			Account c1 = new Account(number, name, balance, limit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double debit = scan.nextDouble();
			
			c1.withdraw(debit);
			System.out.println("New balance: " + String.format("%.2f", c1.getBalance()));
			
		}catch (AccountException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		scan.close();
	}

}
