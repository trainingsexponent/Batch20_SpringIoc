package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext apc = new AnnotationConfigApplicationContext(Config.class);
		
		A a = apc.getBean("a",A.class);
		System.out.println(a);
	}
}
