package com.springcore.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("com/springcore/Collections/collection_config.xml");
        Emp e1 = (Emp) context.getBean("Emp1");
        System.out.println(e1);

	}

}
