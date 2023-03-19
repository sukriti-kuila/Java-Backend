package com.springcore.annotationonly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
		Student s = container.getBean("stu", Student.class);
		System.out.println(s);
		s.display();
		

	}

}
