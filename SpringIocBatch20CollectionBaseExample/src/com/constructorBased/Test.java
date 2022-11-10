package com.constructorBased;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext apc =  new ClassPathXmlApplicationContext("com/constructorBased/NewFile.xml");
		
		Shopkeeper shopkeeper = apc.getBean("s",Shopkeeper.class);
		
		System.out.println(shopkeeper);
		
		Map<Integer, String> mData = shopkeeper.getMap();
		
		for(Map.Entry<Integer, String>  m : mData.entrySet()) {
			System.out.println("Key : " + m.getKey() + " Value : " + m.getValue() );
		}
		
		System.out.println(mData.get(5));
	}

}
