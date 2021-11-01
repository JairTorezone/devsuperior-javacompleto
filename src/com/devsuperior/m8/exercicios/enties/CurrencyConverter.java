package com.devsuperior.m8.exercicios.enties;

public class CurrencyConverter {

	public static double convertDolar(double price, double qtd) {
		double total = price * qtd;
		return total +=  total * 6/100;
	}
}
