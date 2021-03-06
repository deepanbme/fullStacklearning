package com.training.qn06;

import org.junit.Test;

/**
 * 
 * @author Deepan
 * Convert String array to String String[] input1=["Vikas","Lokesh",Ashok]
 *  Expected output String: "Vikas,Lokesh,Ashok"
 */
public class ArrayString 
{
	@Test
	public void TestCase1()
	{
		String[] str = {"Vikas","Lokesh","Ashok"};
		String output = conArrString(str);
		System.out.println(output);
	}
	
	@Test
	public void TestCase2()
	{
		String[] str = {"Vikas"};
		String output = conArrString(str);
		System.out.println(output);
	}
	
	@Test
	public void TestCase3()
	{
		String[] str = {};
		String output = conArrString(str);
		System.out.println(output);
	}
	
	public String conArrString(String[] str)
	{
		if(str.length == 1) return str[0];
		if(str.length == 0) return null;
		String res = "";
		int cnt = str.length-1;
		for(String inp : str)
		{
			if(cnt>0) res+=inp+",";
			else res+=inp;
			cnt--;
		}
		
		return res;
	}
}
