package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	private Address addr;

	public Address getAddr() {
		return addr;
	}

	@Autowired
	public void setAddr(Address addr) {
		System.out.println("Setter method called");
		this.addr = addr;
	}

	public Emp(Address addr) {
		this.addr = addr;
	}

	public Emp() {
		super();
		System.out.println("Deafult cons");
	}

	@Override
	public String toString() {
		return "Emp [addr=" + addr + "]";
	}
	
	
	
}
