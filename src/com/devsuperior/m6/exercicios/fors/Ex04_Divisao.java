package com.devsuperior.m6.exercicios.fors;

import java.util.Scanner;

public class Ex04_Divisao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			if(y == 0) {
				System.out.println("divisão impossível");
				
			}else {
				
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
			
			
		}
		
	}

}
