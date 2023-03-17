package com.springcore.Lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Mycls2 implements InitializingBean,DisposableBean {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting Price in Mycls2");
		this.price = price;
	}

	public Mycls2() {
		super();
	}

	@Override
	public String toString() {
		return "price=" + price;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init method mycls2");
		
	}
	public void destroy() throws Exception {
		System.out.println("destroy method mycls2");	
	}
	
	
}
