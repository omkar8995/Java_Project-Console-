package com.tka_Project;

public class Booking {
	private static int bookingCounter = 1001;

	private static final double DISCOUNT = 0.10;

	private int bookingId;
	private Customer customer;
	private Room room;
	private int days;
	private double totalBill;
	private boolean checkedOut;

	public Booking(int bookingId, Customer customer, Room room, int days, double totalBill, boolean checkedOut) {
		super();
		this.bookingId = bookingId;
		this.customer = customer;
		this.room = room;
		this.days = days;
		this.totalBill = totalBill;
		this.checkedOut = false;

		calculateBill();
		room.setAvailable(false);
	}
	
	 public void calculateBill() {

	        // Polymorphism
	        double rent = room.calculateRent(days);

	        // Discount for 5 or more days
	        if (days >= 5) {

	            rent = rent - (rent * DISCOUNT);
	        }

	        // GST
	        double gst = rent * Room.GST;

	        totalBill = rent + gst;
	    }
	 
	 // Display booking
	    public void displayBooking() {

	        System.out.println("\n===== BOOKING DETAILS =====");

	        System.out.println("Booking ID : " + bookingId);
	        System.out.println("Customer   : " + customer.getName());
	        System.out.println("Phone      : " + customer.getPhone());
	        System.out.println("Room No    : " + room.getRoomNo());
	        System.out.println("Room Type  : " + room.getRoomType());
	        System.out.println("Days       : " + days);
	        System.out.println("Total Bill : ₹" + totalBill);
	        System.out.println("Status     : "
	                + (checkedOut ? "Checked-Out" : "Active"));
	    }

	    // Checkout
	    public void checkOut() {

	        if (checkedOut) {

	            System.out.println("Customer has already checked out.");

	        } else {

	            room.setAvailable(true);
	            checkedOut = true;

	            System.out.println("\nCheckout successful!");
	            System.out.println("Customer : " + customer.getName());
	            System.out.println("Final Bill: ₹" + totalBill);
	        }
	    }

		public static int getBookingCounter() {
			return bookingCounter;
		}

		public static void setBookingCounter(int bookingCounter) {
			Booking.bookingCounter = bookingCounter;
		}

		public int getBookingId() {
			return bookingId;
		}

		public void setBookingId(int bookingId) {
			this.bookingId = bookingId;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		public Room getRoom() {
			return room;
		}

		public void setRoom(Room room) {
			this.room = room;
		}

		public int getDays() {
			return days;
		}

		public void setDays(int days) {
			this.days = days;
		}

		public double getTotalBill() {
			return totalBill;
		}

		public void setTotalBill(double totalBill) {
			this.totalBill = totalBill;
		}

		public boolean isCheckedOut() {
			return checkedOut;
		}

		public void setCheckedOut(boolean checkedOut) {
			this.checkedOut = checkedOut;
		}

		public static double getDiscount() {
			return DISCOUNT;
		}
		@Override
	    public String toString() {

	        return "Booking ID: " + bookingId
	                + ", Customer: " + customer.getName()
	                + ", Room: " + room.getRoomNo()
	                + ", Days: " + days
	                + ", Bill: ₹" + totalBill
	                + ", Status: "
	                + (checkedOut ? "Checked-Out" : "Active");
	    }

}
