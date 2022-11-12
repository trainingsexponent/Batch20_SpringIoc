package com.dependancyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	
	@Bean
	public Employee emp() {
		Employee e = new Employee();
		e.setEid(1);
		e.setEname("Abcd");
		e.setCompany(comp());
		return e;
	}
	
	@Bean
	public Company comp() {
		Company c = new Company();
		c.setCid(123);
		c.setCname("Congnizant");
		
		return c;
	}
}
