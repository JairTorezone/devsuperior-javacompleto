package com.devsuperior.m6.estruturarepeticao;

import java.util.Scanner;

public class Main_DoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double c = scan.nextDouble();
			double f = 9.0 * c / 5.0 +32.0;
			System.out.printf("Equivalente em Fahrentheit: %.1f%n",f);
			System.out.println("Deseja repetir (s/n)? ");
			resp = scan.next().charAt(0);
		}while(resp != 'n');
		
		scan.close();
	}

}
