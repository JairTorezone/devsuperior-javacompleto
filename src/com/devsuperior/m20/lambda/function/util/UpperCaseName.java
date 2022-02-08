package com.devsuperior.m20.lambda.function.util;

import java.util.function.Function;

import com.devsuperior.m20.lambda.function.entities.Product;

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		
		return p.getName().toUpperCase();
	}

}
