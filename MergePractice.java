import java.util.Arrays;
class MergePractice
{
	public static void mergeSort(int arr[],int left , int right)
	{
		if(left<right)
		{
			int mid = (left+right)/2;	
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
	public static void merge(int arr[],int left ,int mid, int right)
	{
		int n1 = mid-left+1;
		int n2 = right-mid;
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];
		System.arraycopy(arr,left,leftArray,0,n1);
		System.arraycopy(arr,mid+1,rightArray,0,n2);
		
		int i = 0 ; int j = 0 ; int k = left ;
		while(i<n1 && j<n2)
		{
			if(leftArray[i]<=rightArray[j])
			{
				arr[k] = leftArray[i];
				i++;
			}
			else
			{
				arr[k]=rightArray[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k] = leftArray[i];
			k++;
			i++;
		}
		while(j<n2)
		{
			arr[k] = rightArray[j];
			k++;
			j++;
		}
	}
	public static void main(String args[])
	{
		int arr[] = {66,34,1,3,64,4,23,34,22,5,7,87};
		mergeSort(arr,0,arr.length-1);
		System.out.print(Arrays.toString(arr));
	}
}