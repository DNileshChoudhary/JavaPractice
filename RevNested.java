import java.util.*;
class RevNested
{
	public static void main(String args[])
	{	int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n-value :");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{ for (j=n; j>=i;j--)
			{System.out.print(j+" ");}
		System.out.println();
		} 
	}
}