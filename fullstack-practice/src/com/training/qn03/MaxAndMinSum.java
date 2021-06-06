package com.training.qn03;

import org.junit.Test;

/**
 * @author Deepan
 * Find the sum of maximum and minimum number from a given input array Input:{19,17,12} max - 
 * 19 min - 12 sum - 31 Output:31
 */
public class MaxAndMinSum 
{
	@Test
	public void TestCase1()
	{
		int[] inp = {19,17,12};
		int output = findSum(inp);
		System.out.println(output);
	}
	
	@Test
	public void TestCase2()
	{
		int[] inp = {19,17};
		int output = findSum(inp);
		System.out.println(output);
	}

	public int findSum(int[] num) 
	{
		int maxVal = Integer.MIN_VALUE;
		int minVal = Integer.MAX_VALUE;
		
		for (int i = 0; i < num.length; i++) 
		{
			maxVal = Math.max(maxVal, num[i]);
			minVal = Math.min(minVal, num[i]);
		}
		
		return maxVal+minVal;
	}
}
