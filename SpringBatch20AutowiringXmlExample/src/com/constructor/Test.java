package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		
		ApplicationContext apc =new ClassPathXmlApplicationContext("com/constructor/newFile.xml");
		
		University university = (University) apc.getBean("u");
		System.out.println(university);
	}
}
