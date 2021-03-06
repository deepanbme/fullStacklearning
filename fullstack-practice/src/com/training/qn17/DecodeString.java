package com.training.qn17;

import org.junit.Test;

/**
 * 
 * @author Deepan
 *	Given a method with a string input. Write code to encrypt the given string using following rules and return the encrypted string:
a. Replace the character at odd positions by next character in alphabet b. Leave the characters at even positions unchanged

Note:

if an odd position character is 'z' replace it by 'a'
assume the first character in the string is at position 1
Example input = curiosity output = dusipsjtz
 */
public class DecodeString 
{
	@Test
	public void TestCase1()
	{
		String str = "curiosity";
		String out = decodeString(str);
		System.out.println(out);
	}

	public String decodeString(String str) 
	{
		char[] ch = str.toCharArray();
		String res = "";
		
		for (int i = 0; i < ch.length; i++) 
		{
			if((i+1)%2!=0) res+=(char)(1+ch[i]);
			else res+=ch[i];
		}
		return res;
	}
}
