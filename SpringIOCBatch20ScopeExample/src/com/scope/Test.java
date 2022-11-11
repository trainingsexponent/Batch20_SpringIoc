package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/scope/NewFile.xml");
		Product product = apc.getBean("p",Product.class);
		System.out.println(product);
		System.out.println(product.hashCode());
		
		System.out.println("------------------------------------------");
		Product product1 = apc.getBean("p",Product.class);
		System.out.println(product1);
		System.out.println(product1.hashCode());
	}

}
