import java.util.*;
class MinHeap
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Elements : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int i , j;
		System.out.print("Enter the Elements : ");
		for( j = 0 ; j<n ; j++)
		{

			if(j==0)
			{
				arr[j]= sc.nextInt();
			}
			else
			{
				arr[j]= sc.nextInt();
				i = j ;
				while(i>0)
				{
					int p = (i-1)/2;
					if(arr[i]>arr[p])
					{
						break;
					}
					else
					{
						int tem = arr[i];
						arr[i] = arr[p];
						arr[p] = tem ;
						i = p;
					}
				}
			}
		}//for-loop ends

		System.out.print("Minimum Heap : ");
		for(int x : arr)
		{
			System.out.print(x+" ");
		}
		System.out.print("\nLeaf Nodes : ");
		for(i = 0 ; i<n ; i++)
		{
			if(((2*i+1)>=n)&& ((2*i+2)>=n))
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
