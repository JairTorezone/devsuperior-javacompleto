package com.devsuperior.m20.lambda.argumentfuncition.model.service;

import java.util.List;

import com.devsuperior.m20.lambda.argumentfuncition.entities.Product;

public class ProductService {

	public double filteredSoma(List<Product> list) {
		double sum = 0.0;
		for (Product p : list) {
			if(p.getName().charAt(0) == 'T') {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
