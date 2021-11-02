package com.devsuperior.m4.exercicios;

import java.util.Scanner;

public class Ex05_ValorUnitario {

	public static void main(String[] args) {
		//Ex05
		Scanner scan = new Scanner(System.in);
		
		int codigo1, qto1,codigo2, qto2;
		double preco1, preco2, total;
		
		codigo1 = scan.nextInt();
		qto1 = scan.nextInt();
		preco1 = scan.nextDouble();
		
		codigo2 = scan.nextInt();
		qto2 = scan.nextInt();
		preco2 = scan.nextDouble();
		
		total = preco1 * qto1 + preco2 * qto2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
	}

}
