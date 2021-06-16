package com.training.qn21;

import org.junit.Test;

/**
 * 
 * @author Deepan
 * Given a method with an int array. Write code to find the power of each individual 
 * element according to its position index, add them up and return as output. Example: input = {3,6,2,1} output = (3)0+(6)1+(2)2+(1)3 = 1+6+4+1=12
 */
public class PowerIndex 
{
	@Test
	public void TestCase1()
	{
		int[] num = {3,6,2,1};
		int out = findPowIndex(num);
		System.out.println(out);
	}

	public int findPowIndex(int[] num) 
	{
		int res = 0;
		for (int i = 0; i < num.length; i++) 
		{
			res+=Math.pow(num[i], i);
		}
		
		return res;
	}
}
