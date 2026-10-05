package com.tka_Project;

public class Hotel {
	public static final String HOTEL_NAME = "Grand Palace Hotel";
	
	private Room[] rooms;
    private Customer[] customers;
    private Booking[] bookings;
    
    private int customerCount;
    private int bookingCount;
    
    public Hotel() {

        rooms = new Room[10];
        customers = new Customer[20];
        bookings = new Booking[20];

        customerCount = 0;
        bookingCount = 0;

        addRooms();
    }
    
    private void addRooms() {

        rooms[0] = new StandardRoom(101, 1500);
        rooms[1] = new StandardRoom(102, 1500);
        rooms[2] = new StandardRoom(103, 1800);

        rooms[3] = new DeluxRoom(201, 2500);
        rooms[4] = new DeluxRoom(202, 2800);
        rooms[5] = new DeluxRoom(203, 3000);
    }
    
    public void displayRooms() {

        System.out.println("\n===== " + HOTEL_NAME + " =====");
        System.out.println("        ROOM DETAILS");

        for (int i = 0; i < rooms.length; i++) {

            if (rooms[i] != null) {

                rooms[i].displayRoom();
                System.out.println("----------------------------");
            }
        }
    }
    
    public void addCustomer(Customer customer) {

        // Check duplicate ID
        if (findCustomer(customer.getCustomerId()) != null) {

            System.out.println("Customer ID already exists.");
            return;
        }

        if (customerCount < customers.length) {

            customers[customerCount] = customer;
            customerCount++;

            System.out.println("Customer registered successfully.");

        } else {

            System.out.println("Customer storage is full.");
        }
    }
    
    // Find customer
    public Customer findCustomer(int customerId) {

        for (int i = 0; i < customerCount; i++) {

            if (customers[i].getCustomerId() == customerId) {

                return customers[i];
            }
        }

        return null;
    }
    
    // Find room
    public Room findRoom(int roomNo) {

        for (int i = 0; i < rooms.length; i++) {

            if (rooms[i] != null
                    && rooms[i].getRoomNo() == roomNo) {

                return rooms[i];
            }
        }

        return null;
    }
    
    // Create booking
    public void createBooking(int customerId, int roomNo, int days) {

        Customer customer = findCustomer(customerId);
        Room room = findRoom(roomNo);

        if (customer == null) {

            System.out.println("Customer not found.");

        } else if (room == null) {

            System.out.println("Room not found.");

        } else if (!room.isAvailable()) {

            System.out.println("Room is already booked.");

        } else if (days <= 0) {

            System.out.println("Number of days must be greater than 0.");

        } else if (bookingCount >= bookings.length) {

            System.out.println("Booking storage is full.");

        } else {

            Booking booking = new Booking(roomNo, customer, room, days, days, false);

            bookings[bookingCount] = booking;
            bookingCount++;

            System.out.println("Booking created successfully.");

            booking.displayBooking();
        }
    }
    
    // Display all bookings
    public void displayBookings() {

        System.out.println("\n===== ALL BOOKINGS =====");

        if (bookingCount == 0) {

            System.out.println("No bookings available.");

        } else {

            for (int i = 0; i < bookingCount; i++) {

                System.out.println(bookings[i]);
            }
        }
    }

    
    // Checkout
    public void checkOut(int bookingId) {

        for (int i = 0; i < bookingCount; i++) {

            if (bookings[i].getBookingId() == bookingId) {

                bookings[i].checkOut();

                return;
            }
        }

        System.out.println("Booking ID not found.");
    }

}
