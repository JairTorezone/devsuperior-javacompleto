package com.devsuperior.m7.convencoes;

import java.util.Scanner;

public class Main_Funcoes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int heiger = max(a, b, c);
		showResult(heiger);
		
		
		scan.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		
		if(x > y && x > z) {
			aux = x;
			
		}else if(y > x && y > z) {
			aux = y;
			
		}else {
			aux = z;
		}
		
		return aux;
	}
	
	public static void showResult(int number) {
		System.out.println("Higher = "+ number);
	}

}
