package com.training.OOPS;

public class MainMethodConsChaining 
{
	public static void main(String[] args) 
	{
		ConstructorChaining con = new ConstructorChaining(100, "deepan", 100);
		System.out.println(con.getCost());
		System.out.println(con.getId());
		System.out.println(con.getName());
	}
}
