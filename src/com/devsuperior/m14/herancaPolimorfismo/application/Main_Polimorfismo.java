package com.devsuperior.m14.herancaPolimorfismo.application;

import com.devsuperior.m14.herancaPolimorfismo.entities.Account;
import com.devsuperior.m14.herancaPolimorfismo.entities.SavingsAccount;

public class Main_Polimorfismo {

	public static void main(String[] args) {
		
		Account c1 = new Account(1001, "João", 1000.00);
		Account c2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
		
		//Chamamos o mesmo método do objeto Account com comportamento diferente - POLIMORFISMO
		c1.withdraw(50.00);
		c2.withdraw(50.00);
		
		System.out.println("c1 - " + c1.getBalance());
		System.out.println("c2 - " + c2.getBalance());
	}

}
