package com.training.qn15;

import java.util.Arrays;

import org.junit.Test;
/**
 * 
 * @author Deepan
 * Display unique characters in a string. input:"helloworld" output:"helowrd"
 */
public class UniqueChar 
{
	@Test
	public void TestCase1()
	{
		String str = "helloworld";
		String out = findUnqChar(str);
		System.out.println(out);
	}

	public String findUnqChar(String str) 
	{
		String res = "";
		int[] ascii = new int[127];
		
		for (char i : str.toCharArray()) 
		{
			if(ascii[i] < 1) ascii[i]++;
		}
		
		for (char i : str.toCharArray()) 
		{
			if(ascii[i] >0)
			{
				ascii[i] = 0;
				res+=i;
			}
		}
		
		System.out.println(Arrays.toString(ascii));
		return res;
	}
}
