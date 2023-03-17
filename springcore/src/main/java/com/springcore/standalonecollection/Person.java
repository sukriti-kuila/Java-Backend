package com.springcore.standalonecollection;

import java.util.List;

public class Person {
	private List<String>frnds;

	public List<String> getFrnds() {
		return frnds;
	}

	public void setFrnds(List<String> frnds) {
		this.frnds = frnds;
	}
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [frnds=" + frnds + "]";
	}
	
}
