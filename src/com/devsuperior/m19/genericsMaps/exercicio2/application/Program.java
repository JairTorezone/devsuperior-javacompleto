package com.devsuperior.m19.genericsMaps.exercicio2.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.devsuperior.m19.genericsMaps.exercicio2.entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Set<Aluno> set = new HashSet<Aluno>();
		
		Set<Integer> a = new HashSet<Integer>();
		Set<Integer> b = new HashSet<Integer>();
		Set<Integer> c = new HashSet<Integer>();

		System.out.print("How many students for course A? ");
		int n = scan.nextInt();

		addList(set, n, scan,a);
		
		System.out.print("How many students for course B? ");
		n = scan.nextInt();

		addList(set, n, scan,b);

		System.out.print("How many students for course c? ");
		n = scan.nextInt();

		addList(set, n, scan,c);

		System.out.print("Total students: ");
		System.out.println(set.size());
		
		System.out.println();
		System.out.println("Lista de alunos");
		for (Aluno z : set) {
			System.out.println(z);
		}
		
		System.out.println();
		System.out.println("Turma A:");
		for(Integer A: a) {
			System.out.println(A);
		}
		
		System.out.println("Turma B:");
		printTurma(b);
		
		System.out.println("Turma C:");
		printTurma(c);

		scan.close();
	}
	
	public static void addList(Set set, int n, Scanner scan, Set x) {
		for (int i = 1; i <= n; i++) {
			int number = scan.nextInt();
			set.add(new Aluno(number));
			x.add(number);
		}
	}
	
	public static void printTurma(Set<Integer>x) {
		for(Integer value: x) {
			System.out.println(value);
		}
	}

}
