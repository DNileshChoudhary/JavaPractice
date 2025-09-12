import java.util.Arrays;
public class MergeSort
{
	public static void mergeSort(int[] array , int L ,int R)
	{
		if(L<R)
		{
			int mid = (L+R)/2; // Recursively sort the two havles
			mergeSort(array,L,mid);
			mergeSort(array,mid+1,R);
			merge(array,L,mid,R);
		}
	}
	public static void merge(int[] array,int left , int mid , int right)
	{
		// find sizes of the two subarrays to be merged
		int n1 = mid-left+1;
		int n2 = right - mid;
		
		//create temporary arrays
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];
		
		//copy data to temporary arrays
		System.arraycopy(array,left,leftArray,0,n1);
		System.arraycopy(array,mid+1,rightArray,0,n2);
		
		//merge the temporary arrays back into the original array
		int i = 0 , j = 0 ; //Initial indexes of left and right arrays 
		int k = left; // Initial index of merged subarray 

		while(i<n1 && j<n2)
		{
			if(leftArray[i]<=rightArray[j])
			{
				array[k]= leftArray[i];
				i++;
			}
			else 
			{
				array[k]= rightArray[j];
				j++;
			}
			k++;
		}
		
		//Copy remaining elements of leftArray[] if any 
		while(i<n1)
		{
				array[k]= leftArray[i];
				i++;
				k++;
		}
		
		// Copy remaining elements of rightArray[] if any
		while(j<n2)
		{
			array[k]=rightArray[j];
			j++;
			k++;
		}
	}
	public static void main(String args[])
	{
		int[] array = {3,6,2,6,45,67,34,9,33};
		System.out.println("Unsorted array : "+Arrays.toString(array));
		//Apply merge sort
		mergeSort(array,0,array.length-1);
		System.out.println("Sorted array : "+Arrays.toString(array));
	}
}