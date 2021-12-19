package com.devsuperior.m18.interfaces.exercicio.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.m18.interfaces.exercicio.model.entities.Contract;
import com.devsuperior.m18.interfaces.exercicio.model.entities.Installment;
import com.devsuperior.m18.interfaces.exercicio.model.service.ContractService;
import com.devsuperior.m18.interfaces.exercicio.model.service.PayService;

public class Main {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = scan.nextInt();
		scan.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		Date prazo = sdf.parse(scan.nextLine());
		System.out.print("Contract value: ");
		double valueTotal = scan.nextDouble();
		
		Contract c = new Contract(number, prazo, valueTotal);
		
		System.out.print("Enter number of installments: ");
		int qtd = scan.nextInt();
		
		ContractService cs = new ContractService(new PayService());
		cs.processContract(c, qtd);
		
		System.out.println();
		System.out.println("Installments:" );
		for(Installment is: c.getInstallments()) {
			System.out.println(is);
		}
		


		
		
		scan.close();
	}

}
