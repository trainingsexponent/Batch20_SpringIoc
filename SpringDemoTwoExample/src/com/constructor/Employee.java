package com.constructor;

public class Employee {
	
	private int  eid;
	
	private String ename;
	
	private double salary;

	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	

}
