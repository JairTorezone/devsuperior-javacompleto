package com.devsuperior.m4.exercicios;

import java.util.Scanner;

public class Ex04_CalSalarioFuncionario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numerFuncionario;
		double horasTrabalhada, valorHora, calculo;
		
		numerFuncionario = scan.nextInt();
		horasTrabalhada = scan.nextDouble();
		valorHora = scan.nextDouble();
		
		calculo = horasTrabalhada * valorHora;
		System.out.println(numerFuncionario);
		System.out.println();
		System.out.printf("SALARY = U$ %.2f", calculo);
	}

}
