package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("com/NewFile.xml");

		Student student = apc.getBean("s",Student.class);

		System.out.println(student);
		System.out.println(student.hashCode());
		
		System.out.println("------------------------------------------------");
		
		ApplicationContext apc1 = new FileSystemXmlApplicationContext("D:\\NewFile.xml");
        Student student2 = apc1.getBean("s",Student.class);
        System.out.println(student2);
	}
}
