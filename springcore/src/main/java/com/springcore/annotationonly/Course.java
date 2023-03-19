package com.springcore.annotationonly;

import org.springframework.beans.factory.annotation.Value;

public class Course {
	@Value("Java")
	private String lan;

	@Override
	public String toString() {
		return "Course [lan=" + lan + "]";
	}
}
