package com.devsuperior.m8.exercicios.enties;

public class Studant {

	public String name;
	public double n1, n2, n3;
	
	public double notaFinal() {
		return n1 + n2 + n3;
	}
	
	public String missingPoints() {
		if(notaFinal() > 60) {
			return "PASS";
		}
		double difer = 60 - notaFinal();
		return "FAILED\n" + "MISSING " + difer + " POINTS";
	}
	
	@Override
	public String toString() {
		return "FINAL GRADE = " + notaFinal() + "\n" + missingPoints();
	}
	
	
}
