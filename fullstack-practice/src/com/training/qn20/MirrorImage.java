package com.training.qn20;

/**
 * 
 * @author Deepan
 * Create a class containing a method to create the mirror image of a String. The method should return the two Strings separated with 
 * a pipe(|) symbol .
Method Name - getImage
Argument - String
Return Type - String
Logic - Accepts One String. Find the mirror image of the String. Add the two Strings together separated by a pipe(|) symbol. 
For Example Input : EARTH Output : EARTH|HTRAE
 */
public class MirrorImage 
{
	public String getImage(String str)
	{
		char[] ch = str.toCharArray();
		int left = 0, right = ch.length-1;
		
		while(left<=right)
		{
			char temp = str.charAt(left);
			ch[left++] = str.charAt(right);
			ch[right--] = temp;
		}
		
		
		return str+"|"+String.valueOf(ch);
		
	}
}
