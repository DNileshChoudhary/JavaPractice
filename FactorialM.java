import java.util.*;
class FactorialM
{	
	public static long FactM(int n)
	{
		long fact = 1;
		for(int i=1 ; i<=n ; i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number n : ");
		int n = sc.nextInt();
		long fact = FactM(n);
		System.out.println("Factorial of "+n+" is : "+fact);
	}
}