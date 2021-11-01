package com.devsuperior.m5.exercicios;

import java.util.Scanner;

public class Ex04_CalcHorasJOgo {
/* EXERCICIOS 04
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
 * sabendo que o mesmo pode começar em um dia e terminar em outro, 
 * tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int horaInicial, horaFinal;
		
		horaInicial = scan.nextInt();
		horaFinal = scan.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		
	}

}
