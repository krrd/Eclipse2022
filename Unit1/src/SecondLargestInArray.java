
public class SecondLargestInArray 
{
	public static void main(String args[])
	{
		int num[] = {6,3,7,8};
		
		int temp =0;
		
		System.out.println("Elements in the array are:");
		
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
		
		//Sorting array in descending order
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]<num[j])
				{
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("Sorted array:");
		
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println("Second Largest in the array is:"+num[1]);
	}
}
