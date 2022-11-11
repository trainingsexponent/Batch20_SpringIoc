package com.scope;

public class Product {
	
	private int pid;
	
	private String name;
	
	private String category;
	
	public Product() {
		// TODO Auto-generated constructor stub
		System.out.println("Product Const. Called");
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", category=" + category + "]";
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
