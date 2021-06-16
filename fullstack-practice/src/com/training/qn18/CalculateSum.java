package com.training.qn18;

/**
 * 
 * @author Deepan
 * Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
Method Name - calculateSum
Argument - int n
Return Type - int sum
Logic - Calculate the sum of first n natural numbers which are divisible by 3 or 5.
 */
public class CalculateSum 
{
	public int calculateSum(int num)
	{
		int res = 0;
		for (int i = 1; i <= num; i++) 
		{
			if(i%3==0 || i%5==0) res+=i;
		}
		
		return res;
	}
}
