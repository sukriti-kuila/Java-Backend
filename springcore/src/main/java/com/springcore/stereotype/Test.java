package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo_config.xml");
		Student s = container.getBean("ob", Student.class);
		System.out.println(s);

	}

}
