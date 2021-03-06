package com.training.qn16;

import org.junit.Test;

/**
 * 
 * @author Deepan
 * Given a method with two strings as input. Write code to modify the first string such 
 * that all characters are replace by plus sign(=) except the characters which are present in the 
 * second string. That is, if one or more characters of first string appear in second string, they will not be replace by +. Return the modified string as output. Note-ignore case.
Example: input1 = New York input2 = New Jersy output = New Y+r+
 */
public class ReplaceSecondString 
{
	@Test
	public void TestCase1()
	{
		String str1 = "New York";
		String str2 = "New Jersy";
		String out = replaceString(str1, str2);
		System.out.println(out);
	}

	public String replaceString(String str1, String str2) 
	{
		String res = "";
		
		for (char i : str1.toCharArray()) 
		{
			boolean flag = false;
			for (char j : str2.toCharArray()) 
			{
				if(Character.toLowerCase(i) == Character.toLowerCase(j)) flag = true;
			}
			
			if(flag) res+=i;
			else res+='+';
		}
		
		return res;
	}
}
