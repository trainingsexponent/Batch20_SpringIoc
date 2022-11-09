package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/NewFile.xml");
		
		Product product = apc.getBean("p",Product.class);
		
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
	}
}
