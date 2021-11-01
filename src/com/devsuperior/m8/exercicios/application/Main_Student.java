package com.devsuperior.m8.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.m8.exercicios.enties.Studant;

public class Main_Student {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Studant s = new Studant();
		s.name = sc.nextLine();
		s.n1 = sc.nextDouble();
		s.n2 = sc.nextDouble();
		s.n3 = sc.nextDouble();
		
		System.out.println(s);
	}
}
