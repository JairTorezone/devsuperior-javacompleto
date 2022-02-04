package com.devsuperior.m14.herancaPolimorfismo.exercicios.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.devsuperior.m14.herancaPolimorfismo.exercicios.entities.ImportedProduct;
import com.devsuperior.m14.herancaPolimorfismo.exercicios.entities.Product;
import com.devsuperior.m14.herancaPolimorfismo.exercicios.entities.UsedProduct;

public class Program_Ex01 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Program #" + i + " data:");

			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = scan.next().charAt(0);

			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Price: ");
			double price = scan.nextDouble();
			
			if (ch == 'c') {
				Product p = new Product(name, price);
				list.add(p);

			} else if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(scan.next());

				UsedProduct usedP = new UsedProduct(name, price, date);
				list.add(usedP);

			} else {
				System.out.print("Customs fee: ");
				double customsFee = scan.nextDouble();

				ImportedProduct imp = new ImportedProduct(name, price, customsFee);
				list.add(imp);
			}

		}

		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product c : list) {
			System.out.println(c.priceTag());
		}

		scan.close();
	}

}
