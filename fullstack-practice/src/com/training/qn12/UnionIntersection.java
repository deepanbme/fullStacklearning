package com.training.qn12;

import java.util.Arrays;

import org.junit.Test;

/**
 * Find (A union B) - (A intersection B) Sample input: int[] a={1,2,3,4}; int[] b={3,4,5,6}; 
 * a union b = {1,2,3,4,5,6} a intersection b = {3,4} (a union b) - (a intersection b) = {1,2,5,6} 
 * Sample output: int[] c={1,2,5,6}
 */
public class UnionIntersection 
{
	@Test
	public void TestCase1()
	{
		int[] numArr1 = {1,2,3,4};
		int[] numArr2 = {3,4,5,6};
		int[] output = findUnionIntersection(numArr1, numArr2);
		System.out.println(Arrays.toString(output));
	}
	
	public int[] findUnionIntersection(int[] numArr1, int[] numArr2) 
	{
		int[] findUn = findUnion(numArr1, numArr2);
		int[] findInter = findIntersection(numArr1, numArr2);
		return findIntersection(findUn, findInter);
	}

	public int[] findUnion(int[] numArr1, int[] numArr2) 
	{
		int counter = 0;
		
		for (int i : numArr1) 
		{
			for (int j : numArr2) 
			{
				if(i==j) counter++;
			}
			
		}
		
		int[] out = new int[numArr1.length+(numArr2.length-counter)];
		
		for (counter = 0; counter < numArr1.length; counter++) 
		{
			out[counter] = numArr1[counter];
		}
		
		for (int i : numArr2) 
		{
			boolean flag = false;
			for (int j : out) 
			{
				if(i==j) flag = true;
			}
			
			if(!flag) out[counter++] = i;
		}

		
		return out;
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
