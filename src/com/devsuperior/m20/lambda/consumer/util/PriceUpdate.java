package com.devsuperior.m20.lambda.consumer.util;

import java.util.function.Consumer;

import com.devsuperior.m20.lambda.consumer.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice()* 1.1);
	}

	
}
