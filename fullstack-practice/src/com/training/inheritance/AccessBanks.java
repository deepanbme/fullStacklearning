package com.training.inheritance;

public class AccessBanks 
{
	public static void main(String[] args) 
	{
		Bank bank = new ICICIBank();
		System.out.println(bank.AccNo);
		
		Bank bk = new HDFCBank();
		System.out.println(bk.AccNo);
	}
}
