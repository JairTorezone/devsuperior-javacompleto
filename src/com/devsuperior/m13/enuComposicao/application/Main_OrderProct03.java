package com.devsuperior.m13.enuComposicao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.m13.enuComposicao.entities.Client;
import com.devsuperior.m13.enuComposicao.entities.Order;
import com.devsuperior.m13.enuComposicao.entities.OrderItem;
import com.devsuperior.m13.enuComposicao.entities.Product;
import com.devsuperior.m13.enuComposicao.entities.enums.OrderStatus;

public class Main_OrderProct03 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = scan.nextLine();
		System.out.print("Email: ");
		String email = scan.nextLine();
		System.out.print("Birth: ");
		Date dateBirth = sdf.parse(scan.next());
		
		Client client = new Client(name, email, dateBirth);
		
		scan.nextLine();
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String statusOrder = scan.nextLine();
		
		System.out.print("How many items to this order? ");
		int n = scan.nextInt();
		scan.nextLine();
		
		Order  order = new Order(new Date(System.currentTimeMillis()), OrderStatus.valueOf(statusOrder), client);
		OrderItem item;
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Program name: " );
			String nameProduct = scan.nextLine();
			System.out.print("Program price: " );
			double priceProduct = scan.nextDouble();
			String.format("%.2f", priceProduct);
			System.out.print("Quantity: " );
			int quantityProduct = scan.nextInt();
		
			item = new OrderItem(quantityProduct, priceProduct, new Product(nameProduct, priceProduct));
			
			order.addItem(item);
			scan.nextLine();
			
		}
		
		
		System.out.println();
		
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		scan.close();
	}

}
