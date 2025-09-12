import java.util.*;
class MultiplicationTb
{
	public static void main(String args[])
	{
		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n-value : ");
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}	
}