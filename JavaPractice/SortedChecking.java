class SortedChecking
{
	public static void main(String args[])
	{
		int arr[] = {36,34,4,3,2,1}; 
		int increasing  = 0 ;
		int decreasing = 0 ;
		for(int i = 0 ; i<arr.length-1 ; i++)
		{
			
			if (arr[i]>arr[i+1])
			{
				decreasing++ ;
			}
			else if(arr[i]<arr[i+1])
			{
				increasing++;
			}
		}
		if(increasing==arr.length-1)
		{
			System.out.print("Increasing.");
		}
		else if(decreasing==arr.length-1)
		{
			System.out.print("Decresing");
		}
		else
		{
			System.out.print("Not sorted");
		}
	}
}