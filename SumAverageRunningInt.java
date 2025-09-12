import java.util.*;
class SumAverageRunningInt
{
	public static void main(String args[])
	{
		int sum=0, n=0;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Starting Number : ");
		int n1= sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Last Number : ");
		int n2= sc2.nextInt();
		for(int i=1; n1<=n2 ;n1++)
		{
			sum = sum+n1;
			n=i++;
		}
		System.out.println("Sum of N numbers : "+sum);
		System.out.println("Number of terms : "+(n));
		float avg = (float)sum/(n);
		System.out.println("Average of N numbers : "+avg );
	}
}