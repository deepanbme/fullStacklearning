package com.training.inheritance;

public class HDFCBank extends Bank
{
	int AccNo = 10;
	String Acctype = "current";
	
//	public HDFCBank() {
//		super.AccNo = this.AccNo;
//	}
	@Override
	void display() {
		System.out.println("ICIC Bank");
	}
}
