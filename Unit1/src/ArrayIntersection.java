
public class ArrayIntersection 
{
	
	static void Intersection(int x[],int y[])
	{
		int z[]= new int[x.length+y.length];
		int c=0;
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<y.length;j++)
			{
				if(x[i]==y[j])
				{
					z[c]=x[i];
					c++;
					//System.out.println(x[i]);
				}
			}
		}
		System.out.println("The intersecting elements are:");
		for(int k=0;k<c;k++)
		{
			System.out.print(" "+z[k]+" ");
		}
	}
	
	
	public static void main(String[] args)
	{
		int firstArray[] = {5,8,1,6,21,2};
		int secondArray[]= {16,21,1,4,5,9};
		
		Intersection(firstArray,secondArray);
	}

}
