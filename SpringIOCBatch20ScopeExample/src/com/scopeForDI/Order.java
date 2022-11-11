package com.scopeForDI;

public class Order {

	
	private int oid;
	
	private String oname;
	
	public Order() {
		System.out.println("Order Const.Called");
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", oname=" + oname + "]";
	}
	
	
}
