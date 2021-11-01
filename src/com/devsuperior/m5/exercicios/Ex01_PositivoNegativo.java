package com.devsuperior.m5.exercicios;

import java.util.Scanner;

public class Ex01_PositivoNegativo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digita um número");
		int x = scan.nextInt();
		
		mostrarnumaber(x);
		
	}
	
	public static void mostrarnumaber(int x) {
		if(x >= 0) {
			System.out.println("NÃO NEGATIVO");
		}else {
			System.out.println("NEGATIVO");
		}
	}


}
