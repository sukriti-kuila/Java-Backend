package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/config.xml");
		Emp e = container.getBean("Emp1",Emp.class);
		System.out.println(e);
	}
}
