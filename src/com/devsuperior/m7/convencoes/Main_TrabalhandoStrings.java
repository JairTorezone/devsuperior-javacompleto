package com.devsuperior.m7.convencoes;

public class Main_TrabalhandoStrings {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG   ";

		// Convertendo tudo para minúsculo
		String s01 = original.toLowerCase();
		System.out.println("Original -" + original + "-");
		System.out.println("toLowerCase -" + s01 + "-");

		// Convertendo Maiúsculo
		String s02 = original.toUpperCase();
		System.out.println("toUpperCase -" + s02 + "-");

		// Eliminando espaços
		String s03 = original.trim();
		System.out.println("trim -" + s03 + "-");

		// substring criando uma string a partir de uma posição
		String s04 = original.substring(2);
		System.out.println("substring(2) -" + s04 + "-");

		// criar um string passando o inicio e fim
		String s05 = original.substring(2, 9);
		System.out.println("substring(2, 9) -" + s05 + "-");

		// substituir um valor por outro
		String s06 = original.replace('a', 'x');
		System.out.println("replace('a', 'x') -" + s06 + "-");

		// substituir uma substring por outra
		String s07 = original.replace("abc", "xy");
		System.out.println("replace('ab', 'xy') -" + s07 + "-");
		
		//primeria ocorrencia e ultima
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		System.out.println("Index of 'bc: "+ i);
		System.out.println("Last index of 'bc: "+ j);
	}

}
