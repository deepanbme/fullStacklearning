package com.training.qn14;

import org.junit.Test;

/**
 *
 * @author Deepan
 * Concatenate the character in a given position. If there is no character in a given position 
 * place "$" sign. input1[]={"abc","da","ram"}; input2=3; hint : 3rd character is "c" in "abc" 
 * 3rd character is not present in "da", so place "$" 3rd character is "m" in "ram" concate all 
 * the characters to a single string "c$m" o/p string ="c$m";
 */
public class ConCat3Char 
{
	@Test
	public void TestCase1()
	{
		String[] str = {"abc","da","ram"};
		String out = conChar(str);
		System.out.println(out);
	}
	
	@Test
	public void TestCase2()
	{
		String[] str = {"abc","dad","ram"};
		String out = conChar(str);
		System.out.println(out);
	}
	
	@Test
	public void TestCase3()
	{
		String[] str = {"","daddad","ram"};
		String out = conChar(str);
		System.out.println(out);
	}

	public String conChar(String[] str) 
	{
		String out = "";
		
		for (String res : str) 
		{
			if(res.length() < 3) out+="$";
			else if(res.length()>=3) out+=res.charAt(2);
		}
		
		return out;
	}
}
