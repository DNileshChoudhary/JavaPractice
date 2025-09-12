import java.util.Scanner;
class BinarySearch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the Elements of the Sorted Array : ");
		for(int i = 0 ; i<n ; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the Target : ");
		int tar = sc.nextInt();
		int ans = binarySearch(arr,tar);
		if(ans == -1 )
			System.out.print("Target NOT-FOUND!");
		else
			System.out.print("The target is Found at Index : "+ans);
	}
	public static int binarySearch(int[]arr,int tar)
	{
		int low = 0;
		int high = arr.length-1;
		int middle = (low+high)/2;
		boolean flag = false ;
		try
		{
			while(flag==false)
			{
				if(arr[middle]==tar)
				{
					flag = true ;
					return middle;
				}
				else if(arr[middle]<tar)
				{
					low =middle+1 ;
					middle = (low+high)/2;
				}
				else
				{
					high= middle - 1  ;
					middle = (low+high)/2;
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
		}
		return -1  ;
	}
}