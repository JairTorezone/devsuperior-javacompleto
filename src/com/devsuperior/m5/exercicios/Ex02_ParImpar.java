package com.devsuperior.m5.exercicios;

import java.util.Scanner;

public class Ex02_ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		
		num1 = scan.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
	}

}
