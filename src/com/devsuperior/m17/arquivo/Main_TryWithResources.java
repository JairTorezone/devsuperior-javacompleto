package com.devsuperior.m17.arquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main_TryWithResources {

	public static void main(String[] args) {
		
		File file = new File("/home/dev-peixe/Documentos/ProgramasJava/workspaces/ws06-DevSuperior/"
				+ "devsuperior-javacompleto/java-completo/Arquivos/List.txt");
		

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
