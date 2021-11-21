package com.devsuperior.m14.herancaPolimorfismo.exercicios.abstracts.entities;

public class PessoaJuridica extends Pessoa {

	private Integer qtdFuncionario;
	
	public PessoaJuridica() {
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer qtdFuncionario) {
		super(nome, rendaAnual);
		this.qtdFuncionario = qtdFuncionario;
	}

	public Integer getQtdFuncionario() {
		return qtdFuncionario;
	}

	public void setQtdFuncionario(Integer qtdFuncionario) {
		this.qtdFuncionario = qtdFuncionario;
	}

	@Override
	public double calcularImposto() {
		double total = 0;
		
		if(qtdFuncionario > 10) {
			total += rendaAnual * 0.14;
		} else {
			total += rendaAnual * 0.16;
		}
		
		
		return total;
	}
	
	
	
}
