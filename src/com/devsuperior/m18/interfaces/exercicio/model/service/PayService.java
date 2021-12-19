package com.devsuperior.m18.interfaces.exercicio.model.service;

public class PayService implements OnlinePaymentService{
	
	private static final double TAXA_PAGAMENTO = 0.02;
	private static final double TAXA_JUROS = 0.01;
	
	@Override
	public double taxaFixa(double amount) {
		return amount * TAXA_PAGAMENTO;
	}
	
	@Override
	public double taxaPagamentoMes(double amount, int quantidade) {
		return amount * quantidade * TAXA_JUROS;
	}

}
