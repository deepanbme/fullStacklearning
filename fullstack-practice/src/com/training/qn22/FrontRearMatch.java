package com.training.qn22;

import org.junit.Test;

/**
 * 
 * @author Deepan
 * Given a method with a string input. Write code to test if first and last characters are same. Incase they are 
 * same return 1 else return -1 as output. Note: consider case. Example: input = "the picture was great" (first character = 't', 
 * last character = 't') output = 1
 */
public class FrontRearMatch 
{
	@Test
	public void TestCase1()
	{
		String inp = "the picture was great";
		int out = rearMatch(inp);
		System.out.println(out);
	}

	public int rearMatch(String inp) 
	{
		int left = 0, right = inp.length()-1;
		
		if(inp.length() > 1 && inp.charAt(left) == inp.charAt(right)) return 1;
		return -1;
	}
}
