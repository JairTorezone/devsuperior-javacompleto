package com.devsuperior.m10.arrayList.application;

import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.m10.arrayList.entities.Estudante;

public class Main_Pensionista {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante[] estudante = new Estudante[10];
	
		System.out.print("How many rooms will be rented? ");
		int qdt = sc.nextInt();
		sc.nextLine();
	
		
		for(int i = 0; i < qdt; i++) {
			System.out.println("Rent: #"+(i+1)+ ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			
			estudante[room] = new Estudante(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int j = 0; j < estudante.length; j++) {
			if(estudante[j] != null) {
				System.out.println(j + ": "+ estudante[j].getName()+", "+ estudante[j].getEmail());
			}
		}
		
		
		sc.close();
		
	}

}
