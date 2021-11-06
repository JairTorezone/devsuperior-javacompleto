package com.devsuperior.m10.exericios.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.m10.exericios.entities.Employee;

public class Main_ListEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = scan.nextInt();
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			
			int id;
			String name;
			double salary;
			
			System.out.println("Employee #"+(i+1));
			System.out.print("Id: ");
			scan.nextLine();
			id = scan.nextInt();
			System.out.print("Name: ");
			scan.nextLine();
			name = scan.nextLine();
			System.out.print("Salary: ");
			salary = scan.nextDouble();
			
			
			list.add(new Employee(id, name, salary));
			System.out.println();
		}
		
		System.out.println("----------------------");

		System.out.print("Enter the employee id that will have salary increase ");
		int id = scan.nextInt();

		
		boolean exist = true;
		int position = 0;

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getId() == id) {
				exist = true;
				position = i;
				break;
			}
			exist = false;
		}

		if (exist) {
			System.out.print("Enter the percentage: ");
			int bonus = scan.nextInt();

			list.get(position).increaseSalary(bonus);
			System.out.println();

			System.out.println("List of emplyees: ");
			for (Employee x : list) {
				System.out.println(x);
			}
			
		} else {
			System.out.println("This id does not exist!");
			System.out.println();
			
			System.out.println("List of emplyees: ");
			for (Employee x : list) {
				System.out.println(x);
			}

		}
		
		scan.close();
	}

}
