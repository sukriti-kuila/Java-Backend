package com.springcore.Lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mycls3 {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting Price");
		this.price = price;
	}

	public Mycls3() {
		super();
	}

	@Override
	public String toString() {
		return "price is " + price;
	}
	@PostConstruct
	public void init()
	{
		System.out.println("Init method Mycls3");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroy method Mycls3");
	}
	
	
}
