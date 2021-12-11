package com.devsuperior.m17.arquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main_BufferedReader {

	public static void main(String[] args) {

		File file = new File("/home/dev-peixe/Documentos/ProgramasJava/workspaces/ws06-DevSuperior/"
				+ "devsuperior-javacompleto/java-completo/Arquivos/List.txt");
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {

			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
