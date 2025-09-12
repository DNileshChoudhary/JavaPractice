import java.util.*;
class SelectionSort
{
	public static void selectionSort(int []arr)
	{
		int n = arr.length ;
		for(int i = 0 ; i<n-1 ; i++)
		{
		    
			int minimumIdx = i ;
			for(int j = i+1 ; j<=n-1 ; j++)
			{
				if(arr[minimumIdx] > arr[j])
				{
					minimumIdx = j ;
				}
			}
			int tem = arr[i];
			arr[i] = arr[minimumIdx];
			arr[minimumIdx] = tem ; 
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n ;
		System.out.print("Enter the Number of Elements : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the Elements : ");
		for(int i = 0 ; i<n ; i++)
		{
			arr[i]= sc.nextInt();
		}
		selectionSort(arr);
		System.out.println("Sorted Array is : "+Arrays.toString(arr));
	}
}