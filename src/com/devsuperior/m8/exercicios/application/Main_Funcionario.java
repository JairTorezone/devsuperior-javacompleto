package com.devsuperior.m8.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.m8.exercicios.enties.Funcionario;

public class Main_Funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario f = new Funcionario();
		
		f.name = "João Silva";
		f.grossSalary = 6000.00;
		f.taxa = 1000.00;
		
		System.out.println("Nome: "+f.name);
		System.out.printf("Gross Salary:, %.2f \nTaxa %.2f\n ",f.grossSalary, f.taxa);
		System.out.println();
	
		System.out.println("Employee: " + f);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		f.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + f);
		sc.close();
		
		/*
		System.out.println("Employee: "+f.name +", $ "+ f.netSalary());
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double tx = sc.nextDouble();
		System.out.println("Updated data: "+f.name +", $ "+ f.increaseSalary(tx));
		*/
		
		
		
	}

}
