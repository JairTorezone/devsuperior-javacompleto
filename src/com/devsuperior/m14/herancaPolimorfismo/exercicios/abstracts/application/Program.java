package com.devsuperior.m14.herancaPolimorfismo.exercicios.abstracts.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.m14.herancaPolimorfismo.exercicios.abstracts.entities.Pessoa;
import com.devsuperior.m14.herancaPolimorfismo.exercicios.abstracts.entities.PessoaFisica;
import com.devsuperior.m14.herancaPolimorfismo.exercicios.abstracts.entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #"+ i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char type = scan.next().charAt(0);
			
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Anual income: ");
			double rendAnual = scan.nextDouble();
			
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				double taxSaude = scan.nextDouble();
				
				list.add(new PessoaFisica(name, rendAnual, taxSaude));
			}else {
				System.out.println("Number of employees: ");
				int number = scan.nextInt();
				
				list.add(new PessoaJuridica(name, rendAnual, number));
			}
		}
		double totalList = 0;
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for(Pessoa p: list) {
			totalList += p.calcularImposto();
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", totalList));
		
		scan.close();
		
	}
}
