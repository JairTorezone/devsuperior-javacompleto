package com.devsuperior.m6.exercicio.whiles;

import java.util.Scanner;

public class Ex01_SenhaValida {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int senha = scan.nextInt();

		while (senha != 2002) {

			System.out.println("Senha Invalida");
			senha = scan.nextInt();
		}

		System.out.println("Acesso Permitido");

	}

}
