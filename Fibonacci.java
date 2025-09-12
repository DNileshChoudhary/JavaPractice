import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		long a,b,c,i,n;
		System.out.print("Enter n-value : ");
		n=sc.nextLong();
		a=0;b=1;
		System.out.print(a+"  "+b);
		for (i=0;i<n;i++)
		{	c=a+b;
			System.out.print("  "+c);
			a=b;
			b=c;
			
		}
	}
}