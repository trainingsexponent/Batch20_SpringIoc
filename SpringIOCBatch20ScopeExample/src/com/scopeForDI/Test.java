package com.scopeForDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc =  new ClassPathXmlApplicationContext("com/scopeForDI/NewFile.xml");
		
		Customer customer = apc.getBean("c",Customer.class);
		System.out.println(customer);
		System.out.println(customer.hashCode());
		System.out.println(customer.getOrder().hashCode());
		
		System.out.println("=====================================================");
		
		Customer customer1 = apc.getBean("c",Customer.class);
		System.out.println(customer1);
		System.out.println(customer1.hashCode());
		System.out.println(customer1.getOrder().hashCode());
	}

}
