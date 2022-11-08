package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	
	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("Newfile.xml");
		
		Connection con = apc.getBean("m", Connection.class);
		
		con.conON();
		con.conOFF();
		
		System.out.println("--------------------------------");
		con = apc.getBean("o", Connection.class);
		
		con.conON();
		con.conOFF();
	}

}
