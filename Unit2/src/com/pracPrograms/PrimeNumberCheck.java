package com.pracPrograms;

import java.util.Scanner;

public class PrimeNumberCheck 
{
	public static void primeNumCheck(int num)
	{
		boolean flag = false;
		if(num ==0 || num ==1)
		{
			System.out.println("Number is not Prime.");
		}
		else
		{
			for(int i=2;i<num/2;i++)
			{
				if(num%i == 0)
				{
					flag = true;
					break;
				}
			}
		}
		if(!flag)
			System.out.println(num +" is a Prime number");
		else
			System.out.println(num +" is not a Prime number");
	}
	
	//Driver code
	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = myObj.nextInt();
				
		primeNumCheck(num);
		
		myObj.close();
	}

}
