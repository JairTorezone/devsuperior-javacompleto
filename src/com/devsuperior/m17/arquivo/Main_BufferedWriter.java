package com.devsuperior.m17.arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main_BufferedWriter {

	public static void main(String[] args) {
		String[] lines = new String[] { "Java básico", "JPA", "Spring", "SQL", "API Rest" };
		
		String path = "/home/dev-peixe/Documentos/ProgramasJava/workspaces/ws06-DevSuperior/"
				+ "devsuperior-javacompleto/java-completo/Arquivos/Out.txt";
				
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}