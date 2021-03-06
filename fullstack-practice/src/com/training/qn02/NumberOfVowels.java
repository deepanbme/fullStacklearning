package com.training.qn02;

import org.junit.Test;

/**
 * 
 * @author Deepan
 Find the number of vowels in a given string
 Input1:?NewyorkE? 'e' or 'E' - it should be counted as 1 Output1:2 Hint:irrespective of case
 */
public class NumberOfVowels 
{
	char[] vowel = {'a','e','i','o','u'};
	
	@Test
	public void TestCase1()
	{
		String str = "NewyorkEU";
		int output = countVowel(str);
		System.out.println(output);
	}
	
	@Test
	public void TestCase2()
	{
		String str = "";
		int output = countVowel(str);
		System.out.println(output);
	}

	public int countVowel(String str) 
	{
		if(str.length() == 0) return 0;
		
		char[] inpStr = str.toLowerCase().toCharArray();
		boolean res = false;
		int out = 0;
		
		for (int i = 0; i < vowel.length; i++) 
		{
			for (int j = 0; j < inpStr.length; j++) 
			{
				if(vowel[i]==inpStr[j]) res = true;
			}
			
			if(res) out++;
			res = false;
		}
		
		return out;
	}
}
