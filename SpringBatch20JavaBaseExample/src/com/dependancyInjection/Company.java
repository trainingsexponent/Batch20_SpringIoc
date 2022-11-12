package com.dependancyInjection;

public class Company {
	
	private int cid;
	
	private String cname;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + "]";
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	
	

}
