package com.devsuperior.m14.herancaPolimorfismo.exercicios.abstracts.entities;

public abstract class Pessoa {

	protected String nome;
	protected Double rendaAnual;
	
	public Pessoa() {
	}

	public Pessoa(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract double calcularImposto();
	
	@Override
	public String toString() {
		return getNome()
				+": $ "
				+String.format("%.2f", calcularImposto());
	}
}
