package com.devsuperior.m6.exercicios.fors;

import java.util.Scanner;

public class Ex06_CalcuDivisores {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
	}

}
