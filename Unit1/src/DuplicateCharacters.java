

public class DuplicateCharacters
{
	public static void main(String args[])
	{
		String originalStr = "Great responsibility";
		
		//to check for duplicate characters in a String first convert the string to char array and then compare
		System.out.println("Duplicate Characters in the string:");
		char dupString[] = originalStr.toCharArray();
		int count = 0;
		
		for(int i=0;i<dupString.length;i++)
		{
			count = 1;

			for(int j=i+1;j<dupString.length;j++)
			{
				if((dupString[i]==dupString[j]) && dupString[i]!=' ')
				{
					count++;
					dupString[j]='0';
				}
			}
			if(count>1 && dupString[i]!='0')
			{
				System.out.println(dupString[i]);
			}
		}
	}
}

