package com.scopeForDI;

public class Customer {

	private int cid;
	
	private String cname;
	
	private Order order;
	
	public Customer() {
		System.out.println("Customer Const.Called");
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", order=" + order + "]";
	}
	
	
}
