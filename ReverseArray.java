import java.util.*;
class ReverseArray
{
	public static void reverse(int arr[])
	{
		int low = 0 ; 
		int high = arr.length-1;
		while(low<=high)
		{
			int tem = arr[low];
			arr[low] = arr[high];
			arr[high] = tem ; 
			low++;
			high--;
		}
	}
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6};
		reverse(arr);
		System.out.print(Arrays.toString(arr));
	}
}