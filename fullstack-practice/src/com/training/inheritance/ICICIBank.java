package com.training.inheritance;

public class ICICIBank extends Bank
{
	int AccNo = 2;
	String Acctype = "Savings";
	
	public ICICIBank() {
		super.AccNo = this.AccNo;
	}
	@Override
	void display() {
		System.out.println("ICIC Bank");
	}
}
