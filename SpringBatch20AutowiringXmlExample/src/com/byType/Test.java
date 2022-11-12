package com.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/byType/NewFile.xml");
		
		Student student = apc.getBean("s",Student.class);
		System.out.println(student);
	}

}
