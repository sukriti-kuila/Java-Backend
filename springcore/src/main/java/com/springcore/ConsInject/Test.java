package com.springcore.ConsInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("com/springcore/ConsInject/ci_config.xml");
//		Person p1 = (Person) context.getBean("person1");
//		System.out.println(p1);
		Addition a = (Addition) context.getBean("add1");
		a.doSum();

	}

}
