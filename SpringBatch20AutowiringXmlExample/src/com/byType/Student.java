package com.byType;

public class Student {
	
	private int sid;
	
	private String sname;
	
	private College college;
	
	/*
	 * private College college1;
	 * 
	 * public College getCollege1() { return college1; }
	 * 
	 * public void setCollege1(College college1) { this.college1 = college1; }
	 */

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", college=" + college + "]";
	}
	
	
}
