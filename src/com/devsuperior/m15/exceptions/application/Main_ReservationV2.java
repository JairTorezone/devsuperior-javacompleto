package com.devsuperior.m15.exceptions.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.devsuperior.m15.exceptions.model.entities.ReservationV2;

public class Main_ReservationV2 {

	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number ");
		int number = scan.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(scan.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(scan.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");

		} else {
			ReservationV2 reservationV2 = new ReservationV2(number, checkIn, checkOut);
			System.out.println("ReservationV1: " + reservationV2);

			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(scan.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(scan.next());

			String error = reservationV2.updateDates(checkIn, checkOut);
			if (error != null) {
				System.out.println("Error in reservation: "+ error);
				
			}else {
				System.out.println("ReservationV1: " + reservationV2);
			}

		}

		scan.close();

	}

}
