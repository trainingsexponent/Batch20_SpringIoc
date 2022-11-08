package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		
	
		Resource resource = new ClassPathResource("NewFile.xml");
		
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Connection con = (Connection) beanFactory.getBean("m");
		 con.conON(); 
		 con.conOFF();
		 System.out.println("----------------------------------------------"); 
		 con =(Connection) beanFactory.getBean("o"); 
		 con.conON();
		 con.conOFF();
		 
	}
}
