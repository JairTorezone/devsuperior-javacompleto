package com.devsuperior.m10.Matriz;

import java.util.Locale;
import java.util.Scanner;

public class Main_Matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("------Matriz------");
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		int[][] matriz = new int[m][n];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = scan.nextInt();
			}
		}
		scan.nextLine();
		System.out.println("---------");
		
		int x = scan.nextInt();
		int posI;
		int posJ;
	
		//int px;
		
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if(matriz[i][j] == x) {
					 posI =i;
					 posJ = j;
					System.out.println("Position " + posI+ "," +posJ);
				
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
					
					//matriz[i][posJ] >= matriz[i][j]
					//posJ+= 2;
					//System.out.println("Right: "+ matriz[i][posJ]);
					//posI++;
					//System.out.println("Down: " + matriz[posI][j]);
					//posI -= 2;
					//System.out.println("UP: " + matriz[posI][j]);
					
				}
			}
		}
		
	}

}
