package com.training.qn05;

import org.junit.Test;

/**
 * 
 * @author Deepan
 * Find the sum of the numbers in the given input string array Input:{“2AA”,”12”,”ABC”,”c1a”)
 *  Output:6 (2+1+2+1) Note in the above array 12 must not considered as such it must be considered as 1,2
 *
 */
public class SumOfNumStrings 
{

	@Test
	public void TestCase1()
	{
		String[] str = {"2AA","12","ABC","c1a"};
		int output = countNumString(str);
		System.out.println(output);
	}
	
	@Test
	public void TestCase2()
	{
		String[] str = {"AA","B","ABC","ca"};
		int output = countNumString(str);
		System.out.println(output);
	}
	
	@Test
	public void TestCase3()
	{
		String[] str = {"11","2","123","31"};
		int output = countNumString(str);
		System.out.println(output);
	}

	public int countNumString(String[] str) 
	{
		int res = 0;
		
		for (String inp : str) 
		{
			char[] chArr = inp.toCharArray();
			for (char i : chArr) 
			{
				if(Character.isDigit(i)) res+= Integer.parseInt(String.valueOf(i));
			}
		}
		
		return res;
	}

}
