package com;

public class Oracle implements Connection{

	public Oracle() {
		// TODO Auto-generated constructor stub
		System.out.println("Oracle Cons. Called.");
	}
	
	@Override
	public void conON() {
		// TODO Auto-generated method stub
		System.out.println("Oracle Conn. ON");
	}

	@Override
	public void conOFF() {
		// TODO Auto-generated method stub
		System.out.println("Oracle Conn. Off");
	}

	
}
