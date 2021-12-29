package com.devsuperior.m19.genericsMaps.equalsHashcode.application;

import com.devsuperior.m19.genericsMaps.equalsHashcode.entities.Cliente;

public class Program {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Marai", "maria@gmail.com");
		Cliente c2 = new Cliente("Marai", "maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		
		System.out.println();
		String x = "Devsuperior";
		String y = "Devsuperior";
		
		//POOL STRING
		System.out.println(x == y);
	}

}
