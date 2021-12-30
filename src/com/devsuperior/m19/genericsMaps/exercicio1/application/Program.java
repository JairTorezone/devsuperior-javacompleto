package com.devsuperior.m19.genericsMaps.exercicio1.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.devsuperior.m19.genericsMaps.exercicio1.entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = scan.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Set<LogEntry> set = new HashSet<>();
			
			String line = br.readLine();
			while(line != null) {
				
				String[] fildes = line.split(" ");
				String name = fildes[0];
				Date moment = Date.from(Instant.parse(fildes[1]));
				
				set.add(new LogEntry(name, moment));
				
				line = br.readLine();
			}
			
			System.out.print("Total users: " + set.size());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		scan.close();
	}

}
