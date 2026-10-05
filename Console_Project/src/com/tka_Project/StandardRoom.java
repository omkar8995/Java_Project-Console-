package com.tka_Project;

public class StandardRoom extends Room {

	public StandardRoom(int roomNo,double price) {
		super(roomNo,"Standard Room",price);
		// TODO Auto-generated constructor stub
	}
	@Override
    public double calculateRent(int days) {

        double serviceCharge = 200;

        return (price * days) + serviceCharge;
    }
	
	@Override
    public void displayRoom() {

        System.out.println("Room No        : " + roomNo);
        System.out.println("Room Type      : " + roomType);
        System.out.println("Price/Day      : ₹" + price);
        System.out.println("Service Charge : ₹200");
        System.out.println("Available      : " + available);
    }
}
