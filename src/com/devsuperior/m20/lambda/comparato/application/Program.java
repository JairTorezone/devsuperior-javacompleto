package com.devsuperior.m20.lambda.comparato.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.devsuperior.m20.lambda.comparato.entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Iphone", 1900.00));
		
		Collections.sort(list);
		
		for (Produto p : list) {
			System.out.println(p);
		}
	}

}
