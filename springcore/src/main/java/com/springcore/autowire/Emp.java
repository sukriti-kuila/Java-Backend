package com.springcore.autowire;

public class Emp {
	private Address addr;

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
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
