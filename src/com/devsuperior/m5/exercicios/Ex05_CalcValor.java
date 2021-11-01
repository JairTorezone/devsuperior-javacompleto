package com.devsuperior.m5.exercicios;

import java.util.Scanner;

public class Ex05_CalcValor {

	public static void main(String[] args) {
		//EXERCICIO 05
		/*Com base na tabela abaixo, escreva um programa que leia o código de um 
		 * item e a quantidade deste item. A seguir, calcule e mostre o valor da
		 *  conta a pagar.*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CODIGO  ESPECIFICACÃO  PREÇO");
		System.out.println("1   Cachorro quente   R$ 4,00");
		System.out.println("2   X-Salada          R$ 4,50");
		System.out.println("3   X-Bacon           R$ 5,00");
		System.out.println("4   Torrada Simples   R$ 2,00");
		System.out.println("5   Refrigerante      R$ 1,50");
		
		int codigo, qdto;
		double valor;
		
		codigo = scan.nextInt();
		qdto = scan.nextInt();
		
		if(codigo <= 5) {
			if(codigo == 1) {
				valor = qdto * 4;
				System.out.printf("Total: R$ %.2f%n", valor);
			}else if(codigo == 2) {
				valor = qdto * 4.5;
				System.out.printf("Total: R$ %.2f%n", valor);
			}else if(codigo == 3) {
				valor = qdto * 5;
				System.out.printf("Total: R$ %.2f%n", valor);
			}else if(codigo == 4) {
				valor = qdto * 2;
				System.out.printf("Total: R$ %.2f%n", valor);
			}else if(codigo == 5) {
				valor = qdto * 1.5;
				System.out.printf("Total: R$ %.2f%n", valor);
			}

		}else {
			System.out.println("Código inválido!");
		}
		
	}

}
