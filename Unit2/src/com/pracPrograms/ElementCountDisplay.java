package com.pracPrograms;


public class ElementCountDisplay
{
	public static void countDisplay(String str1)
	{
		StringBuilder sb = new StringBuilder();
		
		//Counter for keeping count of elements
		int count = 1;
		//initial element of String
		char checkChar = str1.charAt(0);
		
		for(int i=1;i<str1.length();i++)
		{
			if(str1.charAt(i)== checkChar)
			{
				count++;
			}
			else
			{
				sb.append(checkChar).append(count);
				count = 1;
				checkChar = str1.charAt(i);
			}
		}
		//Display
		sb.append(checkChar).append(count);
		System.out.println(sb.toString());
	}
	
	
	public static void main(String[] args) 
	{
		String str = "aab";
		
		countDisplay(str);

	}

}
