package com.tka_Project;

public class Room {
	protected int roomNo;
    protected String roomType;
    protected double price;
    protected boolean available;
    
    public static final double GST = 0.18;
    
	public Room(int roomNo, String roomType, double price) {
		super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.price = price;
		
	}
	
	

	public double calculateRent(int days) {

        return price * days;
    }
	
	public void displayRoom() {

        System.out.println("Room No   : " + roomNo);
        System.out.println("Room Type : " + roomType);
        System.out.println("Price     : ₹" + price);
        System.out.println("Available : " + available);
    }

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public static double getGst() {
		return GST;
	}

    
    

}
