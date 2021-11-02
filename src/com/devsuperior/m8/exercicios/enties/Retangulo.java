package com.devsuperior.m8.exercicios.enties;

public class Retangulo {

	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return width + width + height + height;
	}
	
	public double diagonal() {
		double diagonal = Math.pow(width, 2) + Math.pow(height, 2);
		return Math.sqrt(diagonal);
	}
	//metodos toString
	@Override
	public String toString() {
		return "AREA = "+ String.format("%.2f",  area())+ "\n"
				+"PERIMETER = "+ String.format("%.2f", perimeter())+"\n"
				+"DIAGONAL =  "+String.format("%.2f", diagonal());
	}
}
