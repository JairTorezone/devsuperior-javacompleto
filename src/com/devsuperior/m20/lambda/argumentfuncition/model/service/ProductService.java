package com.devsuperior.m20.lambda.argumentfuncition.model.service;

import java.util.List;
import java.util.function.Predicate;

import com.devsuperior.m20.lambda.argumentfuncition.entities.Product;

public class ProductService {

	public double filteredSoma(List<Product> list, Predicate<Product> criterio) {
		double sum = 0.0;
		for (Product p : list) {
			if(criterio.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
