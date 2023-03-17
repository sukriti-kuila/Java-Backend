package com.springcore.Lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new  ClassPathXmlApplicationContext("com/springcore/Lifecycle/config.xml");
		context.registerShutdownHook();
//		Mycls ob = (Mycls) context.getBean("mycls");
//		System.out.println(ob);
//		Mycls2 ob1 = (Mycls2) context.getBean("mycls2");
//		System.out.println(ob1);
		Mycls3 ob2 = (Mycls3) context.getBean("mycls3");
		System.out.println(ob2);
	}
}
