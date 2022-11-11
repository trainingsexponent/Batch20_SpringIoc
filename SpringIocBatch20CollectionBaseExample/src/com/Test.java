package com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/NewFile.xml");
		
		OnlineShop onlineShop = apc.getBean("o",OnlineShop.class);
		
		System.out.println(onlineShop.getOid());
		System.out.println(onlineShop.getShopName());
		List<Student> l = onlineShop.getStudents();
		for(Student s : l) {
			System.out.println(s);
		}
		
		System.out.println(onlineShop.getElectronic());
		System.out.println(onlineShop.getMap());
	}
}
