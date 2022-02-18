package com.devsuperior.m20.lambda.stream.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		Stream<Integer> st1 = list.stream().map(x -> x * 10); // map - Aplica uma função a cada elemento da stream
		System.out.println(Arrays.toString(st1.toArray())); // toArray converte a stream para um vetor
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		
	}

}
