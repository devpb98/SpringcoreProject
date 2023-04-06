package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println(price);
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Init method");
		price = 25;
	}
	
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy method");
	}
	
}
