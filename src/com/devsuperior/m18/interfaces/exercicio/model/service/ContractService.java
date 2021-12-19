package com.devsuperior.m18.interfaces.exercicio.model.service;

import java.util.Calendar;
import java.util.Date;

import com.devsuperior.m18.interfaces.exercicio.model.entities.Contract;
import com.devsuperior.m18.interfaces.exercicio.model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months){
		double basicValue = contract.getTotalValue() / months;
		
		for(int i = 1; i <= months; i++) {
			double updateValue = basicValue  + onlinePaymentService.taxaPagamentoMes(basicValue, i);
			double valueTotal = updateValue + onlinePaymentService.taxaFixa(updateValue);
			
			Date dueDate = addMonths(contract.getDate(), i);
			contract.getInstallments().add(new Installment(dueDate, valueTotal));
		}
	}
	
	private Date addMonths(Date date, int n) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONDAY, n);
		return calendar.getTime();
	}
}
