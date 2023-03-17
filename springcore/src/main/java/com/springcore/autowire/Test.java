package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("com/springcore/autowire/config.xml");
		Emp e = (Emp)container.getBean("Emp1",Emp.class);
		System.out.println(e);

	}

}
