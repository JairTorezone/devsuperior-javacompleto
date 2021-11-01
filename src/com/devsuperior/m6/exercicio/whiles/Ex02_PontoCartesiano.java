package com.devsuperior.m6.exercicio.whiles;

import java.util.Scanner;

public class Ex02_PontoCartesiano {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro");
			}else if(x < 0 && y > 0) {
				System.out.println("Segundo");
			}else if(x < 0&& y < 0) {
				System.out.println("Terceiro");
			}else {
				System.out.println("Quarto");
			}
			
			 x = scan.nextInt();
			 y = scan.nextInt();
		}
	}

}
