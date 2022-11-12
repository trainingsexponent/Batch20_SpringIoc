package com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc = new AnnotationConfigApplicationContext(AppBean.class);
		
		Person person = apc.getBean("per",Person.class);
		System.out.println(person);
		System.out.println(person.hashCode());
		
		System.out.println("===========================================");
		
		Person person1 = apc.getBean("per",Person.class);
		System.out.println(person1);
		System.out.println(person1.hashCode());
		
		System.out.println("============================================");
		
		List<Person> plist = apc.getBean("lp",List.class);
		System.out.println(plist);
	}

}
