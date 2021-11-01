package com.devsuperior.m7.convencoes;

public class Main_Split {

	public static void main(String[] args) {
		
		String s = "potato apple lemon oragem";
		
		String[] fruts = s.split(" ");
		
		System.out.println(fruts[0]);
		System.out.println(fruts[1]);
		System.out.println(fruts[2]);
		System.out.println(fruts[3]);
	}

}
