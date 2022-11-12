package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class A {
	
	private int id;
	
	private String name;
	
	@Autowired
	@Qualifier(value = "b2")
	private B b;
	
	@Autowired
	private B b1;

	public B getB1() {
		return b1;
	}

	public void setB1(B b1) {
		this.b1 = b1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + ", b=" + b + ", b1=" + b1 + "]";
	}
	

}
