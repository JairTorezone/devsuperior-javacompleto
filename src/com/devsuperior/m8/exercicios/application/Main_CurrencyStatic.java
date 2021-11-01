package com.devsuperior.m8.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.m8.exercicios.enties.CurrencyConverter;

public class Main_CurrencyStatic {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollar will be bought? ");
		double qtd = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f " ,CurrencyConverter.convertDolar(price, qtd));
	}

}
