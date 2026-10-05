package com.tka_Project;

public class DeluxRoom extends Room{

	public DeluxRoom(int roomNo, double price) {
		super(roomNo, "Delux Room", price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public double calculateRent(int days) {

        double serviceCharge = 500;

        return (price * days) + serviceCharge;
    }
	
	@Override
    public void displayRoom() {

        System.out.println("Room No        : " + roomNo);
        System.out.println("Room Type      : " + roomType);
        System.out.println("Price/Day      : ₹" + price);
        System.out.println("Service Charge : ₹500");
        System.out.println("Available      : " + available);
    }

}
