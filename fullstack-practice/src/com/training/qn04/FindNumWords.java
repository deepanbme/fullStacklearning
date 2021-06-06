package com.training.qn04;

import org.junit.Test;

/**
 *
 * @author Deepan
 * Find the number of words are of given length Input1:{“aa”,”b”,”cc”,”ddd”} Input2:2 Output1:2
 *
 */
public class FindNumWords 
{
	@Test
	public void TestCase1()
	{
		String[] str = {"aa","b","cc","ddd"};
		int inpCheck = 2;
		int output = countWord(str, inpCheck);
		System.out.println(output);
	}
	
	@Test
	public void TestCase2()
	{
		String[] str = {"aa","b","cc","ddd"};
		int inpCheck = 3;
		int output = countWord(str, inpCheck);
		System.out.println(output);
	}

	public int countWord(String[] str, int inpCheck) 
	{
		int res = 0;
		for (String strCheck : str) 
		{
			if(strCheck.length()==inpCheck) res++;
		}
		
		return res;
	}
}
