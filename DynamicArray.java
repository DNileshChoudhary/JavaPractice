import java.util.*;
class DynamicArray
{
	public static void main(String args[])
	{
		int n,tot=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n : ");
		n=sc.nextInt();
		int []arr=new int[n];
		System.out.printf("Enter %d marks",n);
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			tot+=arr[i];
		}
		float avg;
		avg=tot/(float)n;
		System.out.printf("Total Marks=%d",tot);
		System.out.printf("\n Average=%2.f",avg);
	}
}
