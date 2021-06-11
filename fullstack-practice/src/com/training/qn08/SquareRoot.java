package com.training.qn08;

import org.junit.Test;

/**
 * Square root calculation ((x1+x2)(x1+x2))+((y1+y2)(y1+y2)) o/p should be rounded of to int; 
 * Sample input: double x1=5; double x2=6; double y1=8; double y2=3; output : 15
 */
public class SquareRoot 
{
	@Test
	public void TestCase1()
	{
		double x1 = 5, x2 = 6, y1 = 8, y2 = 3 ;
		int out = sqFunction(x1, x2, y1, y2);
		System.out.println(out);
	}

	public int sqFunction(double x1, double x2, double y1, double y2) 
	{
		return (int) Math.sqrt((((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2))));
	}
}
