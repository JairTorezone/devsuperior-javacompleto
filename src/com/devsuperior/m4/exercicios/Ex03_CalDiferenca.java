package com.devsuperior.m4.exercicios;

import java.util.Scanner;

public class Ex03_CalDiferenca {

	public static void main(String[] args) {
		//Ex03
		Scanner scan = new Scanner(System.in);
		
		int a,b,c,d;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		
		int diferenca = (a * b - c * d);
		System.out.println("DIFERENCA = " + diferenca);
		
	}

}
