import java.util.*;
class NewFactorial
{
	public static void main(String args[])
	{
		long n,i,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n-value : ");
		n=sc.nextLong();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			if(i==1)
			System.out.print("Factorial of "+n+" ="+i);
			else{System.out.print("*"+i);}
		}System.out.print(" = "+fact);
	}
}