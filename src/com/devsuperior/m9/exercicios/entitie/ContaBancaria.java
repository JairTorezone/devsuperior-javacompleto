package com.devsuperior.m9.exercicios.entitie;

public class ContaBancaria {

	private int num;
	private double saldo = 0;
	private String name;
	
	//Construtores
	public ContaBancaria() {}
	
	public ContaBancaria(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public ContaBancaria(int num, double saldoInicial, String name) {
		super();
		this.num = num;
		depositar(saldoInicial);
		this.name = name;
	}

	//Métodos Gets e Sets
	public double getSaldo() {
		return saldo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}
	
	//Métodos da conta
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor + 5;
	}
	
	@Override
	public String toString() {
		return "Account " 
				+ num
				+", Holder: "
				+name
				+", Balance: $ "
				+String.format("%.2f",getSaldo());
	}
	
}
