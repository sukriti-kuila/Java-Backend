package com.springcore.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("com/springcore/standalonecollection/standalone_config.xml");
		Person a = container.getBean("person1", Person.class);
		System.out.println(a.getFrnds().getClass().getName());

	}

}
