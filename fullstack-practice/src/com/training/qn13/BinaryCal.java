package com.training.qn13;

import java.util.Arrays;
import java.util.BitSet;

import org.junit.Test;

/**
 * Convert decimal to binary Sample input : 12 Sample output : 1100
 */
public class BinaryCal 
{
	@Test
	public void TestCase1()
	{
		int num = 12;
		String output = findBinary(num);
		System.out.println(output);
	}

	public String findBinary(int num) 
	{
		
		return Integer.toBinaryString(num);
	}
}
