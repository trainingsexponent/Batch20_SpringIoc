package com.setterBasedUserdefined;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/setterBasedUserdefined/NewFile.xml");
		
		Employee employee = (Employee) apc.getBean("e");
		System.out.println(employee);
		System.out.println(employee.getEid());
		System.out.println(employee.getEname());
		System.out.println(employee.getAddress());
		System.out.println(employee.getCompany().getCid());
		System.out.println(employee.getCompany().getCname());
	}
}
