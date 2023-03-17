package com.springcore.ConsInject;

public class Person {
	private String name;
	private int id;
	private Certi cer;
	public Person(String name, int id, Certi cer)
	{
		this.name = name;
		this.id = id;
		this.cer= cer;
	}

	@Override
	public String toString() {
		return "name=" + name + ", id= " + id+",certificate"+cer;
	}
}
