import java.util.Scanner;
class TwoNested
{
	public static void main(String args[])
	{
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n-value: ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{System.out.print(i+" ");}
			System.out.println();
		}
		for(i=n;i>=1;i--)
		{
			for(j=1; j<=i;j++)
			{
				System.out.print(i+" ");
			}System.out.println();
		}
	}
}