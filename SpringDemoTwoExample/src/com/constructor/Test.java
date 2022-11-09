package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/constructor/NewFile.xml");
		
		Employee employee = (Employee) apc.getBean("e");
		
		System.out.println(employee.getEid());
		System.out.println(employee.getEname());
		System.out.println(employee.getSalary());
	}

}
