package com.devsuperior.m15.exceptions.exercicio.model.entities;

import com.devsuperior.m15.exceptions.exercicio.model.exception.AccountException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}
	
	

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}



	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		if(amount <= 0) {
			System.out.println("valor invalido, tem que ser maior que 0");
			
		}else {
			balance += amount;
		}
		
	}
	
	public void withdraw(double amount) throws AccountException {
		if(withdrawLimit < amount) {
			throw new AccountException("The amount exceeds withdraw limit");
			
		}else if(balance < amount) {
			throw new AccountException("Not enough balance");
			
		}else {
			balance -= amount;
		}
		
	}
	
}
