package com.devsuperior.m8.exercicios.enties;

public class Funcionario {

	public String name;
	public double grossSalary;
	public double taxa;

	public double netSalary() {
		return grossSalary - taxa;

	}

	public void increaseSalary(double valor) {
		grossSalary += grossSalary * (valor / 100);

	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}

}
