package com.devsuperior.m14.herancaPolimorfismo.exercicios.abstracts.entities;

public class PessoaFisica extends Pessoa {

	private Double taxsaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double taxsaude) {
		super(nome, rendaAnual);
		this.taxsaude = taxsaude;
	}

	public Double getTaxsaude() {
		return taxsaude;
	}

	public void setTaxsaude(Double taxsaude) {
		this.taxsaude = taxsaude;
	}

	@Override
	public double calcularImposto() {
		double total;

		if (rendaAnual < 20000.00) {
			total = (rendaAnual * 0.15)-(taxsaude * 0.5);

		} else {
			total = (rendaAnual * 0.25)  -(taxsaude * 0.5);
		}

		return total;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
