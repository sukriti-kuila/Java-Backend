package com.springcore.Lifecycle;

public class Mycls {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting Price");
		this.price = price;
	}

	public Mycls() {
		super();
	}

	@Override
	public String toString() {
		return "price=" + price;
	}
	public void init()
	{
		System.out.println("Init method Mycls");
	}
	public void destroy()
	{
		System.out.println("Destroy method Mycls");
	}
	
}
