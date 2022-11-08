package com;

public class Mysql implements Connection{

	public Mysql() {
		// TODO Auto-generated constructor stub
		System.out.println("Mysql Cons. called");
	}
	
	@Override
	public void conON() {
		// TODO Auto-generated method stub
		System.out.println("Mysql Conn. On");
	}

	@Override
	public void conOFF() {
		// TODO Auto-generated method stub
		System.out.println("Mysql Conn. Off");
	}

}
