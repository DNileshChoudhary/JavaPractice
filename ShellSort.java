import java.util.*;
class ShellSort
{
	public static void shellSort(int arr[])
	{
		int n = arr.length ;
		Scanner sc = new Scanner(System.in);
		int pass= 0 ; 
		for(int gap = n/2 ; gap>0 ; gap/=2)
		{
			for(int i = gap ; i>0 ; i-- )
			{
				int tem = arr[i]; 
				int j ; 
				for(j = i ; j>=gap && arr[j-gap]>tem ; j-=gap)
				{
					arr[j]=arr[j-gap];
				}
				arr[j]= tem ; 
			}
			System.out.println("Gap : "+gap+"\n"+Arrays.toString(arr));
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Elements : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the Elements : ");
		for(int i = 1 ; i<n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("\nAfter Sorting : ");
		shellSort(arr);
		System.out.print(Arrays.toString(arr));
	}
}