package com.devsuperior.m5.exercicios;

import java.util.Scanner;

public class Ex07_eixoXeY {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double x, y;
		
		x = scan.nextDouble();
		y = scan.nextDouble();
		
		if(x > 0 && y > 0) {
			System.out.println("Q1");
		}
		
		if(x > 0 && y < 0) {
			System.out.println("Q4");
		}
		
		if(x < 0 && y > 0) {
			System.out.println("Q2");
		}
		
		if(x < 0 && y < 0) {
			System.out.println("Q3");
		}
		if(x == 0 && y ==  0) {
			System.out.println("Origem");
		}
		
	}

}
