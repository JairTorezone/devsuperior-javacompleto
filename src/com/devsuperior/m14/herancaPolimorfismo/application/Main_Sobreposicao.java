package com.devsuperior.m14.herancaPolimorfismo.application;

import com.devsuperior.m14.herancaPolimorfismo.entities.Account;
import com.devsuperior.m14.herancaPolimorfismo.entities.BusinessAccount;
import com.devsuperior.m14.herancaPolimorfismo.entities.SavingsAccount;

public class Main_Sobreposicao {

	public static void main(String[] args) {
		
		Account c1 = new Account(1001, "João", 1000.00);
		c1.withdraw(200.00);;
		System.out.println("Account - " + c1.getBalance());
		
		Account c2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
		c2.withdraw(200.00);;
		System.out.println("SavingsAccount - " + c2.getBalance());
		
		Account c3 = new BusinessAccount(1002, "Bob", 1000.00, 500.00);
		c3.withdraw(200.00);;
		System.out.println("BusinessAccount - " + c3.getBalance());
		
	}

}
