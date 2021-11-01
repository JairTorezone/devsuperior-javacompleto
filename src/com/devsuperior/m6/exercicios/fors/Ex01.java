package com.devsuperior.m6.exercicios.fors;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		
		for (int i = 0; i <= x; i++) {
			
			if(x % 2 != 0) {
				System.out.println(x);
			}
		}
	}

}
