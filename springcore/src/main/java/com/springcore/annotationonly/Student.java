package com.springcore.annotationonly;

import org.springframework.stereotype.Component;


public class Student {
	private Course cr;
	
	public Student(Course cr) {
		super();
		this.cr = cr;
	}

	public static void display() {
		System.out.println("Working...");
	}

	@Override
	public String toString() {
		return "Student [cr=" + cr + "]";
	}
}
