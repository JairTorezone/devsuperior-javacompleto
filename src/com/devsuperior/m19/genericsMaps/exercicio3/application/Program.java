package com.devsuperior.m19.genericsMaps.exercicio3.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Map<String, Integer> candidatos = new LinkedHashMap<>();
		
		String path = "/home/dev-peixe/Documentos/ProgramasJava/workspaces/ws06-DevSuperior/devsuperior-javacompleto/"
				+ "java-completo/Arquivos/qtdVotos.txt";
		// scan.nextLine();
		

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				
				String[] fildes = line.split(",");
				String name = fildes[0];
				int qtdVotos = Integer.parseInt(fildes[1]);
				
				if(candidatos.containsKey(name)) {
					int contador = candidatos.get(name);
					candidatos.put(name, qtdVotos + contador);
					
				}else {
					candidatos.put(name, qtdVotos);
				}


				line = br.readLine();
			}
			
			System.out.println("ALL CANDIDATOS:");
			for (String key : candidatos.keySet()) {
				System.out.println(key + " " + candidatos.get(key));

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		scan.close();
	}

}
