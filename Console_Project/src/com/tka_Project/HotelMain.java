package com.tka_Project;

import java.util.Scanner;

public class HotelMain {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        Hotel hotel = new Hotel();

	        int choice = 0;

	        while (choice != 6) {

	            System.out.println("\n==============================");
	            System.out.println("     HOTEL MANAGEMENT SYSTEM");
	            System.out.println("==============================");

	            System.out.println("1. Display Rooms");
	            System.out.println("2. Register Customer");
	            System.out.println("3. Create Booking");
	            System.out.println("4. Display Bookings");
	            System.out.println("5. Check-Out");
	            System.out.println("6. Exit");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:

	                    hotel.displayRooms();

	                    break;

	                case 2:

	                    System.out.print("Enter Customer ID: ");
	                    int customerId = sc.nextInt();

	                    sc.nextLine();

	                    System.out.print("Enter Customer Name: ");
	                    String name = sc.nextLine();

	                    System.out.print("Enter Phone Number: ");
	                    String phone = sc.nextLine();

	                    Customer customer =
	                            new Customer(customerId, name, phone);

	                    hotel.addCustomer(customer);

	                    break;

	                case 3:

	                    System.out.print("Enter Customer ID: ");
	                    int cId = sc.nextInt();

	                    System.out.print("Enter Room Number: ");
	                    int roomNo = sc.nextInt();

	                    System.out.print("Enter Number of Days: ");
	                    int days = sc.nextInt();

	                    hotel.createBooking(cId, roomNo, days);

	                    break;

	                case 4:

	                    hotel.displayBookings();

	                    break;

	                case 5:

	                    System.out.print("Enter Booking ID: ");
	                    int bookingId = sc.nextInt();

	                    hotel.checkOut(bookingId);

	                    break;

	                case 6:

	                    System.out.println("\nThank you for using "
	                            + Hotel.HOTEL_NAME + "!");

	                    break;

	                default:

	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }

	        sc.close();
		
	}

}
