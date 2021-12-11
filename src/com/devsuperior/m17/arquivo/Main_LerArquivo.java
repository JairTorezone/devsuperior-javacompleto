package com.devsuperior.m17.arquivo;

import java.io.File;
import java.util.Scanner;

public class Main_LerArquivo {

	public static void main(String[] args) {
		
		File file = new File("/home/dev-peixe/Documentos/ProgramasJava/workspaces/ws06-DevSuperior/"
				+ "devsuperior-javacompleto/java-completo/Arquivos/List.txt");
		Scanner scan = null;
		
		try {
			
			scan = new Scanner(file);
			while(scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(scan != null) {
				scan.close();
			}
		}
	}

}
