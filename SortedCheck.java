import java.util.*;
class SortedCheck
{
	public static int isSorted(int arr[])
	{
		boolean increasing = true ;
		boolean decreasing = true ;
		for(int i = 0 ; i<arr.length-1 ; i++)
		{
			
			if (arr[i]>arr[i+1])
			{
				increasing = false ;
			}
			else if(arr[i]<arr[i+1])
			{
				decreasing = false;
			}
		}
		if(increasing)
		{
			return 1 ;
		}
		else if(decreasing)
		{
			return 2 ;
		}
		else
		{
			return -1;
		}
	}
	public static void main(String args[])
	{
		int arr[] = {-1,-1,-2, -3}; 
		int ans = isSorted(arr);
		if(ans == 1)
		{
			System.out.println("It is a Ascending Array.");
		}
		else if(ans==2)
		{
			System.out.println("It is a Descending Array.");
		}
		else 
		{
			System.out.print("It is not a Sorted Array.");
		}
	}
}