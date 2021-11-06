package com.devsuperior.m10.List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main_List {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Jose");
		list.add("Pedro");
		list.add("Ana");
		list.add("Monica");
		
		for(String x: list) {
			System.out.println(x);
		}
		
		System.out.println();
		list.add(2, "Fernanda");
		
		for(String x: list) {
			System.out.println(x);
		}
		System.out.println(list.size());
		
		list.remove("Jose");
		System.out.println();
		for(String x: list) {
			System.out.println(x);
		}
		
		list.remove(2);
		System.out.println();
		for(String x: list) {
			System.out.println(x);
		}
		System.out.println("Index of Ana: " + list.indexOf("Ana"));
		list.add("Marcia");
		list.add("Aguida");
		list.add("Mariana");
		System.out.println("-----------------------");
		//Filtrar por em M
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());
		for(String x: result) {
			System.out.println(x);
		}
	}

}
