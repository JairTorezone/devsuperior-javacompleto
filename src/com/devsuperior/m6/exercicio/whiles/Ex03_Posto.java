package com.devsuperior.m6.exercicio.whiles;

import java.util.Scanner;

public class Ex03_Posto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int opcao = scan.nextInt();
		
		int contAlcool = 0;
		int contGasolina = 0;
		int contDieesel = 0;
		while(opcao != 4) {
			
			
			if(opcao == 1) {
				contAlcool +=1;
			}else if(opcao == 2) {
				contGasolina +=1;
			}else if(opcao == 3) {
				contDieesel +=1;
			}else {
				System.out.println("código inválido (fora da faixa de 1 a 4)");
			}
			
			opcao = scan.nextInt();
		}
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + contAlcool);
		System.out.println("Gasolina: " + contGasolina);
		System.out.println("Diesel: " + contDieesel);
	}

}
