package com.devsuperior.m4.exercicios;

import java.util.Scanner;

public class Ex02_calRaio {

	public static void main(String[] args) {
		//Ex02
		Scanner scan = new Scanner(System.in);
		
		double raio = scan.nextDouble();
		double pi = 3.14159;
		
		double area = pi * Math.pow(raio, 2);
		System.out.println(area);
		
		System.out.printf("%.4f",area);
	}

}
