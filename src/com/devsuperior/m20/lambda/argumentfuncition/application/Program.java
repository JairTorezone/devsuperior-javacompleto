package com.devsuperior.m20.lambda.argumentfuncition.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.devsuperior.m20.lambda.argumentfuncition.entities.Product;
import com.devsuperior.m20.lambda.argumentfuncition.model.service.ProductService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSoma(list);
		
		System.out.println("Soma = " + String.format("%.2f", sum));
	}

}
