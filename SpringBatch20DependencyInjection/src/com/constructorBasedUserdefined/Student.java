package com.constructorBasedUserdefined;

public class Student {

	private int sid;
	
	private String sname;
	
	private College college;

	public Student(int sid, String sname, College college) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.college = college;
	}

	public int getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public College getCollege() {
		return college;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", college=" + college + "]";
	}
	
	
}
