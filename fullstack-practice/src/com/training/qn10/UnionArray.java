package com.training.qn10;

import java.util.Arrays;

import org.junit.Test;

/**
 * Find A union B Sample input: int[] a={1,2,3,4}; int[] b={3,4,5,6}; Sample output: int[] c={1,2,3,4,5,6}
 */
public class UnionArray 
{
	@Test
	public void TestCase1()
	{
		int[] numArr1 = {1,2,3,4};
		int[] numArr2 = {3,4,5,6};
		int[] output = findUnion(numArr1, numArr2);
		System.out.println(Arrays.toString(output));
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
}
