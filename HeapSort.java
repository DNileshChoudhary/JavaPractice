//Using maxHeap
import java.util.Arrays;
class HeapSort
{
	public static void heapify(int arr[],int n, int i)
	{
		int largest = i ; 
		int left = 2*i+1;
		int right = 2*i+2;
		
		if(left<n && arr[left]>arr[largest])	largest = left  ;
		if(right<n && arr[right]>arr[largest]) largest = right ;
		
		if(largest!=i)
		{
			int tem = arr[i];
			arr[i] = arr[largest];
			arr[largest] = tem;
			
			heapify(arr,n,largest);
		}
	}
	public static void heapSort(int arr[])
	{
		int n = arr.length  ;
		for(int i= 	n/2-1 ; i>=0 ; i--)
		{
			heapify(arr,n,i);
		}
		for(int i = n-1 ;i>0 ; i--)
		{
			int tem = arr[0];
			arr[0] = arr[i];
			arr[i] = tem ;
			heapify(arr,i,0);
		}
	}
	public static void main(String args[])
	{
		int arr[] = {43,4,6,3,1,76,56,234,34,12,454,993,2};
		heapSort(arr);
		System.out.print(Arrays.toString(arr));
	}
}