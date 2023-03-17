package com.springcore.Ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("com/springcore/Ref/ref_config.xml");
		A a = (A) container.getBean("aref");
		System.out.println(a);
		
		

	}

}
