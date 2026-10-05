package com.tka_Project;

public class Customer {
	private int customerId;
    private String name;
    private String phone;
    
	public Customer(int customerId, String name, String phone) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.phone = phone;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
    
	public void displayCustomer() {

        System.out.println("Customer ID : " + customerId);
        System.out.println("Name        : " + name);
        System.out.println("Phone       : " + phone);
    }

    @Override
    public String toString() {

        return "Customer ID: " + customerId
                + ", Name: " + name
                + ", Phone: " + phone;
    }
    


}
