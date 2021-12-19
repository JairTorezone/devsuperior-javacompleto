package com.devsuperior.m18.interfaces.exercicio.model.service;

public interface OnlinePaymentService {

	double taxaPagamentoMes(double amount, int quantidade);
	
	double taxaFixa(double amount);

	
}
