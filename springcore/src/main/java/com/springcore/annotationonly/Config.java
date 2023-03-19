package com.springcore.annotationonly;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Course getCourse()
	{
		return new Course();
	}
	@Bean
	public Student stu()
	{
		Student s = new Student(getCourse());
		return s;
	}
}
