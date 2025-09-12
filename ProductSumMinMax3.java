import java.util.*;
class ProductSumMinMax3
{
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter 1st Integer : ");
		int n1=sc1.nextInt();
		Scanner sc2 =  new Scanner(System.in);
		System.out.print("Enter 2nd Integer : ");
		int n2=sc2.nextInt();
		Scanner sc3 =  new Scanner(System.in);
		System.out.print("Enter 3rd Integer : ");
		int n3=sc3.nextInt();
		System.out.println("The Sum is : "+(n1+n2+n3));
		System.out.println("The Product is : "+(n1*n2*n3));
		if(n1 >= n2 && n1 >=n3)
		{
			System.out.println("The Maximum Integer is : "+n1);
		}
		else if(n2 >= n1 && n2 >=n3)
		{
			System.out.println("The Maximum Integer is : "+n2);
		}
		else 
		{
			System.out.println("The Maximum Integer is : "+n3);
		}
		if(n1 <= n2 && n1 <=n3)
		{
			System.out.println("The Minimum Integer is : "+n1);
		}
		else if(n2 <= n1 && n2 <=n3)
		{
			System.out.println("The Minimum Integer is : "+n2);
		}
		else 
		{
			System.out.println("The Minimum Integer is : "+n3);
		}
	}
}