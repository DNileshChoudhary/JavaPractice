import java.util.*;
class Star
{
	public static void main(String args[])
	{
		int i,j,k,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n-value : ");
		n=sc.nextInt();
		for (i=1;i<=n;i++)
		{
			for(k=0;k<n-i;k++)
			{
				System.out.print("	");
			}
			for(j=0;j<i;j++)
			{
				System.out.print("	*	");
			}System.out.println();
		}
		
	}
}