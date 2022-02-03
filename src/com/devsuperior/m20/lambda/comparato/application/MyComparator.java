package com.devsuperior.m20.lambda.comparato.application;

import java.util.Comparator;

import com.devsuperior.m20.lambda.comparato.entities.Produto;

public class MyComparator implements Comparator<Produto>{

	@Override
	public int compare(Produto p1, Produto p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
