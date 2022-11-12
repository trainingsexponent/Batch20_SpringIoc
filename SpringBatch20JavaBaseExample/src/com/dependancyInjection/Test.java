package com.dependancyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc = new AnnotationConfigApplicationContext(Config.class);
		
		Employee employee  = (Employee) apc.getBean("emp");
		System.out.println(employee);
	}

}
