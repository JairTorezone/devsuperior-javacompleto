package com.devsuperior.m15.exceptions.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.devsuperior.m15.exceptions.model.entities.ReservationV3;
import com.devsuperior.m15.exceptions.model.exceptions.DomainException;

public class Main_ReservationV3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Room number ");
			int number = scan.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(scan.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(scan.next());

		
			ReservationV3 reservationV3 = new ReservationV3(number, checkIn, checkOut);
			System.out.println("ReservationV1: " + reservationV3);

			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(scan.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(scan.next());

			reservationV3.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservationV3);
			
		}catch (ParseException e) {
			System.out.println("Invalid date format");
			
		}catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
			
		}catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}


		scan.close();

	}

}
