package com.devsuperior.m9.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.m9.exercicios.entitie.ContaBancaria;

public class Main_ContaBancaria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter account number: ");
		int number = scan.nextInt();
		System.out.print("Enter account holder: ");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.print("Is there na initial deposit (y/n)?" );
		char response = scan.next().charAt(0);
		
		ContaBancaria cb;
		
		double saldoDeposito = 0;
		
		if(response == ('y')) {
			System.out.print("Enter initial deposit value: ");
			saldoDeposito = scan.nextDouble();
			
			cb = new ContaBancaria(number, saldoDeposito, name);
		}else {
			
			cb = new ContaBancaria(number, name);
		}
		
		System.out.println();
		System.out.println("Acoount data:");
		System.out.println(cb);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		saldoDeposito = scan.nextDouble();
		cb.depositar(saldoDeposito);
		
		
		System.out.println();
		System.out.println("Update acoount data:");
		System.out.println(cb);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		saldoDeposito = scan.nextDouble();
		cb.sacar(saldoDeposito);
		
		System.out.println();
		System.out.println("Update acoount data:");
		System.out.println(cb);
		
		scan.close();
	}

}
