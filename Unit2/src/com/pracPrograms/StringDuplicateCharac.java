package com.pracPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StringDuplicateCharac 
{

	public static void main(String[] args) 
	{
		String first = "babe";
		
		char arr[] = first.toCharArray();
		
		HashMap<Character,Integer> resultMap = new HashMap<Character,Integer>();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(resultMap.containsKey(arr[i]))
			{
				resultMap.put(arr[i], (resultMap.get(arr[i]))+1);
			}
			else
			{
				resultMap.put(arr[i],1);
			}
		}
		
		//Displaying the map
		
		Set<Entry<Character,Integer>> entrySet = resultMap.entrySet();
		
		for(Entry<Character,Integer> entry: entrySet)
		{
			if(entry.getValue() > 1)
			{
				System.out.println("Duplicate Element:"+entry.getKey());
			}
		}

	}

}
