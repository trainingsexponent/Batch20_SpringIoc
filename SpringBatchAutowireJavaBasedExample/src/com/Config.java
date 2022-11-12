package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	
	@Bean
	public A a() {
		A a = new A();
		a.setId(123);
		a.setName("Abcd");
		//a.setB(b());
		return a;
	}
	
	@Bean
	public B b2() {
		B b = new B();
		b.setId(1);
		b.setName("Qwerty");
		
		return b;
	}
	
	@Bean
	public B b1() {
		B b = new B();
		b.setId(2);
		b.setName("Qwerty123");
		
		return b;
	}
}
