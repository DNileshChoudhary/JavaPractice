//It follow  "divide and conquer property"
//It is In-place Sorting technique
public class QuickSort//time Complexity = O(nlogn) for best and avg case 
					  //worst case Complexity = O(n^2) i.e. for sorted Array
{
	public static void quickSort(int[] arr,int low, int high)
	{
		if(low<high)
		{
			int pivotIndex = partition(arr,low,high);
			// Recursively sort left and right parts 
			quickSort(arr,low,pivotIndex-1);//first half
			quickSort(arr,pivotIndex+1,high);// second half 
		}
	}
	public static int partition(int []arr,int low , int high)
	{
		int pivot = arr[low];
		int up = low+1;
		int down = high;
		
		while(up<= down)
		{
			// Find element greater than pivot
			while(up<=high && arr[up]<=pivot)
			{
				up++;
			}
			// Find element smaller than pivot
			while(down>=low+1 && arr[down]>pivot)
			{
				down--;
			}
			//Swap if up and down haven't crossed
			if(up<down)
			{
				swap(arr,up,down);
			}
		}
		//Swap pivot with down
		swap(arr,low,down);
		return down;//pivot is now at its correct position
	}
	public static void swap(int []arr,int a,int b)
	{
		int tem = arr[a];
		arr[a] = arr[b];
		arr[b] = tem ; 
	}
	public static void main(String args[])
	{
		int arr[] = {3,5,5,99,45,65,25};
		System.out.println("Before Sorting : ");
		for(int x : arr)
		{
			System.out.print(x+" ");
		}
		quickSort(arr,0,arr.length-1);
		System.out.println("\nAfter Sorting : ");
		for(int x : arr)
		{
			System.out.print(x+" ");
		}
	}
}