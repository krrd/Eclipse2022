package com.pracPrograms;

public class ArraySecLargest 
{
	//Print the second largest element of array
	public static void secLargest(int arr[],int arr_size)
	{
		int first,second;
		
		//Minimum length of array 
		if(arr_size < 2)
		{
			System.out.println("Input array is invalid");
			return;
		}
				
		first = second = Integer.MIN_VALUE;
		for(int i=0;i<arr_size;i++)
		{
			//If current element is greater than first then update both first and second
			if(arr[i]>first)
			{
				second = first;
				first = arr[i];
			}
			else if(arr[i]>second && arr[i] !=first)
			{
				second = arr[i];
			}
		}
			
			if(second == Integer.MIN_VALUE)
			{
				System.out.println("There is no second largest");
			}
			else
			{
				System.out.println("Second largest element is: "+second);
			}
}
	
	
	//Driver Code
	public static void main(String[] args) 
	{
		int arr[] = {1,2,1};
		
		int n = arr.length;
		
		secLargest(arr,n);
		
	}

}
