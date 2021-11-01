package com.devsuperior.m6.exercicios.fors;

import java.util.Scanner;

public class Ex05_Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int fatorial = 1;
		
		for (int i = 1; i <= n; i++) {
			
			if(n == 0) {
				fatorial = 1;
			}
			fatorial *= i;
			
		}
		System.out.println(fatorial);
		
		
	}

}
