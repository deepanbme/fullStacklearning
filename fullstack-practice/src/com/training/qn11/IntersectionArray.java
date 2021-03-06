package com.training.qn11;

import java.util.Arrays;

import org.junit.Test;

/**
 * Find A interscetion B Sample input: int[] a={1,2,3,4}; int[] b={3,4,5,6}; Sample output: int[] c={3,4}
 */
public class IntersectionArray 
{
	@Test
	public void TestCase1()
	{
		int[] numArr1 = {1,2,3,4};
		int[] numArr2 = {3,4,5,6};
		int[] output = findIntersection(numArr1, numArr2);
		System.out.println(Arrays.toString(output));
	}
	
	@Test
	public void TestCase2()
	{
		int[] numArr1 = {1,2,3,4};
		int[] numArr2 = {5,6};
		int[] output = findIntersection(numArr1, numArr2);
		System.out.println(Arrays.toString(output));
	}
	
	@Test
	public void TestCase3()
	{
		int[] numArr1 = {};
		int[] numArr2 = {5,6};
		int[] output = findIntersection(numArr1, numArr2);
		System.out.println(Arrays.toString(output));
	}

	public int[] findIntersection(int[] numArr1, int[] numArr2) 
	{
		String str = "";
		
		for (int i : numArr1) 
		{
			boolean flag = false;
			for (int j : numArr2) 
			{
				if(i==j) flag = true;
			}
			
			if(flag) str+=i;
		}
		
		int[] out = new int[str.length()];
		
		for (int i = 0; i < str.length(); i++) 
		{
			out[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		
		return out;
	}
}
