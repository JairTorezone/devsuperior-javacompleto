package com.devsuperior.m5.exercicios;

import java.util.Scanner;

public class Ex03_Multiplos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		scan.close();
		
		
	}

}
