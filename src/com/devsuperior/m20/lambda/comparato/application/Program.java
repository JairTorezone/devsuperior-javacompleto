package com.devsuperior.m20.lambda.comparato.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.devsuperior.m20.lambda.comparato.entities.Produto;

public class Program {

	public static void main(String[] args) {

		List<Produto> list = new ArrayList<>();

		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Iphone", 1900.00));
		
		
//----------------------Classe separada implementando a interface----------------
//		list.sort(new MyComparator());

//----------------------Class Anonymous-------------------------------------------
//		Comparator<Produto> comp = new Comparator<Produto>() {
//			@Override
//			public int compare(Produto p1, Produto p2) {
//				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//			}
//		};
//		
//		list.sort(comp);
		
		
//---------------------Lambda1 - Com return---------------------------------------- 		
//		Comparator<Produto> comp = (p1, p2) -> {
//			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//		};
//		
//		list.sort(comp);
		
//---------------------Lambda2 - Sem return---------------------------------------- 			
//		Comparator<Produto> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//		list.sort(comp);
//		

		
//---------------------Lambda3 - Direto no argumento função--------------------------
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Produto p : list) {
			System.out.println(p);
		}
	}

}
