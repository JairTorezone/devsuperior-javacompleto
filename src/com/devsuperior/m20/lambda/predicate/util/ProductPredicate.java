package com.devsuperior.m20.lambda.predicate.util;

import java.util.function.Predicate;

import com.devsuperior.m20.lambda.predicate.entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100;
	}

}
