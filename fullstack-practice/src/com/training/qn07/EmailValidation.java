package com.training.qn07;

import org.junit.Test;

/**
 * 
 * @author Deepan
 * Email Validation. Output is false if the validation fails else true. 
 * String input1="test@gmail.com" 1)@ & : should be present; 2)@ & . should not be repeated; 
 * 3)there should be four charcters between @ and .; 4)there shouls be atleast 3 characters before @ ; 
 * 5)the end of mail id should be .com; Expected Output=true


 */
public class EmailValidation 
{
	@Test
	public void TestCase1()
	{
		String str = "test@gmail.com";
		boolean out = validEmail(str);
		System.out.println(out);
	}
	
	@Test
	public void TestCase2()
	{
		String str = "test@mail.com";
		boolean out = validEmail(str);
		System.out.println(out);
	}
	
	@Test
	public void TestCase3()
	{
		String str = "test@@mail.com";
		boolean out = validEmail(str);
		System.out.println(out);
	}
	
	@Test
	public void TestCase4()
	{
		String str = "testmailcom";
		boolean out = validEmail(str);
		System.out.println(out);
	}
	
	public boolean validEmail(String str) 
	{
		int firstSpec=0,SecSpec = 0;
		
		if(str.contains("@") && str.contains("."))
		{
			for (char ch : str.toCharArray()) 
			{
				if(ch == '@') firstSpec++;
				if(ch == '.') SecSpec++;
				
			}
			if(firstSpec ==1 && SecSpec == 1)
			{
				firstSpec = str.indexOf("@");
				SecSpec = str.indexOf(".");
				if(str.substring(0, firstSpec).length() >= 4 && str.substring(firstSpec+1, SecSpec).length()==5 && str.substring(SecSpec-1, str.length()).contains(".com"))
				{
					return true;
				}
			}
		}
		return false;
	}
}
