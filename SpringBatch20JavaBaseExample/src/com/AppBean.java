package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppBean {

	@Bean(name = "per")
	//@Scope(value = "singleton")
	@Scope(value = "prototype")
	public Person p() {
		
		Person person = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Person id : " );
		person.setId(sc.nextInt());
		System.out.println("Enter Person name : ");
		person.setPname(sc.next());
		
		return person;
	}
	
	
	@Bean(name = "lp")
	public List<Person> plist() {
		
		List<Person> pl = new ArrayList<Person>();
		Person person = new Person();
		person.setId(1);
		person.setPname("Qwerty");
		Person person1 = new Person();
		person1.setId(2);
		person1.setPname("Anonymous");
		
		pl.add(person);pl.add(person1);
		
		return pl;
	}
}
